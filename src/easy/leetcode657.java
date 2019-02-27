package easy;

public class leetcode657 {

    private String moves;

    public boolean result() {

        int x=0, y=0;
        for (char c : moves.toCharArray()) {
            switch (c){
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }

        return x ==0 && y==0;

    }

    public leetcode657(String moves) {
        this.moves = moves;
    }

    public String getMoves() {
        return moves;
    }

    public void setMoves(String moves) {
        this.moves = moves;
    }
}
