package memento2Pattern;


import mementoPattern.ChessPieces;

public class ChessBoard {

    private ChessPieces[][] board;
    private long blackTime;
    private long whiteTime;

    public ChessBoard() {
        board = new ChessPieces[8][8];
        blackTime = 0;
        whiteTime = 0;
        setDefault();
    }

    // Create a snapshot of the current board state
    public Memento createMemento() {
        return new Memento(copyBoard(), blackTime, whiteTime);
    }

    // Restore from a snapshot
    public void restore(Memento memento) {
        ChessPieces[][] state = memento.getBoardState();
        for (int i = 0; i < 8; i++) {
            System.arraycopy(state[i], 0, board[i], 0, 8);
        }
        this.blackTime = memento.getBlackTime();
        this.whiteTime = memento.getWhiteTime();
    }

    private ChessPieces[][] copyBoard() {
        ChessPieces[][] copy = new ChessPieces[8][8];
        for (int i = 0; i < 8; i++) {
            System.arraycopy(this.board[i], 0, copy[i], 0, 8);
        }
        return copy;
    }

    public long getWhiteTime() {
        return whiteTime;
    }

    public void setWhiteTime(long whiteTime) {
        this.whiteTime = whiteTime;
    }

    public long getBlackTime() {
        return blackTime;
    }

    public void setBlackTime(long blackTime) {
        this.blackTime = blackTime;
    }


    public ChessPieces getCheckPiece(int i, int j) {
        return board[i][j];
    }

    public void nextMove(ChessPieces chessPiece, int row, int col) {
        board[row][col] = chessPiece;
    }

    void setDefault() {
        for (int i = 0; i < 8; i++) {
            board[1][i] = ChessPieces.BPAWN;
            board[6][i] = ChessPieces.WPAWN;
        }
        board[0][0] = ChessPieces.BROOKR;
        board[0][7] = ChessPieces.BROOKL;
        board[7][7] = ChessPieces.WROOKR;
        board[7][0] = ChessPieces.WROOKL;

        board[7][2] = ChessPieces.WBISHOPL;
        board[7][5] = ChessPieces.WBISHOPR;
        board[0][2] = ChessPieces.BBISHOPR;
        board[0][5] = ChessPieces.BBISHOPL;

        board[7][1] = ChessPieces.BKNIGHTR;
        board[7][6] = ChessPieces.BKNIGHTL;
        board[0][1] = ChessPieces.WKNIGHTL;
        board[0][6] = ChessPieces.WKNIGHTR;

        board[7][3] = ChessPieces.WKING;
        board[7][4] = ChessPieces.WQUEEN;
        board[0][3] = ChessPieces.BQUEEN;
        board[0][4] = ChessPieces.BKING;
        for (int i = 0; i < 8; i++) {
            board[2][i] = ChessPieces.BLANK;
            board[3][i] = ChessPieces.BLANK;
            board[4][i] = ChessPieces.BLANK;
            board[5][i] = ChessPieces.BLANK;
        }

    }

    // Inner immutable Memento class
    public static final class Memento {
        private final ChessPieces[][] boardState;
        private final long blackTime;
        private final long whiteTime;

        private Memento(ChessPieces[][] boardState, long blackTime, long whiteTime) {
            this.boardState = boardState;
            this.blackTime = blackTime;
            this.whiteTime = whiteTime;
        }

        private ChessPieces[][] getBoardState() {
            return copy(boardState);
        }

        private long getBlackTime() {
            return blackTime;
        }

        private long getWhiteTime() {
            return whiteTime;
        }

        private ChessPieces[][] copy(ChessPieces[][] original) {
            ChessPieces[][] copy = new ChessPieces[8][8];
            for (int i = 0; i < 8; i++) {
                System.arraycopy(original[i], 0, copy[i], 0, 8);
            }
            return copy;
        }
    }

    private static final String EMPTY = "••";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Black Time: ").append(blackTime).append("\n");
        sb.append("White Time: ").append(whiteTime).append("\n\n");

        sb.append("    a    b    c    d    e    f    g   h\n");
        sb.append("  +----+----+----+----+----+----+----+----+\n");
        for (int rank = 7; rank >= 0; rank--) {
            sb.append(rank + 1).append(" |");
            for (int file = 0; file < 8; file++) {
                String s = symbol(board[rank][file]);
                // force width: one space, glyph, one space
                sb.append(String.format(" %s |", s));
            }
            sb.append(" ").append(rank + 1).append("\n");
            sb.append("  +----+----+----+----+----+----+----+----+\n");
        }
        sb.append("     a    b    c    d    e    f    g    h\n");
        return sb.toString();
    }

    private String symbol(ChessPieces p) {
        if (p == null || p == ChessPieces.BLANK) return EMPTY;
        switch (p) {
            case BKING:
                return "♚";
            case BQUEEN:
                return "♛";
            case BROOKL:
            case BROOKR:
                return "♜";
            case BBISHOPL:
            case BBISHOPR:
                return "♝";
            case BKNIGHTL:
            case BKNIGHTR:
                return "♞";
            case BPAWN:
                return "♟";
            case WKING:
                return "♔";
            case WQUEEN:
                return "♕";
            case WROOKL:
            case WROOKR:
                return "♖";
            case WBISHOPL:
            case WBISHOPR:
                return "♗";
            case WKNIGHTL:
            case WKNIGHTR:
                return "♘";
            case WPAWN:
                return "♙";
            default:
                return "?";
        }
    }

}

