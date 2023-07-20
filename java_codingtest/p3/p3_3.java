public class Solution {
    private static final int dx[] = {0, -1, 1, 0}; //상,좌,우,하
    private static final int dy[] = {-1, 0, 0, 1};

    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) { //4. 빈 책상 근처에 사람있으면 true 없으면 false
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
                continue;
            if (room[ny][nx] == 'P') return true;
        }
        return false;
    }

    private boolean isDistanced(char[][] room, int x, int y) {//3.p의 좌표를 받아서 상,좌,우,하 확인
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
                continue;

            switch (room[ny][nx]) {  //3.1 상,좌,우,하에 p가 있으면 거리 못지킨것
                case 'P': return false;
                case 'O': //3.2 빈 책상이 있는 경우 빈 책상 기준 상,좌,우,하 확인(본인 제외)
                    if (isNextToVolunteer(room, nx, ny, 3- d)) return false;
                    break;
            }
        }
        return true;
    }

    private boolean isDistanced(char[][] room) { //2.좌표 넣어가면서 p가 있는지 확인하고 없는 경우엔 넘어가고 있으면 3번에 좌표를 줌
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (room[y][x] != 'P') continue;
                if (!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }

    public int[] solution(String[][] places) {   //2차원 문자열로 들어온 것들을 문자열로 분리하고 2차원 문자배열에 넣음
        int[] answer = new int[places.length];
        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            if (isDistanced(room)) { //방 전체 기준으로 거리 지켰는지 확인 1
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
}