package javastart.stream;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<BoardGame> boardGameList = new ArrayList<>();

    public void addBoardGame(BoardGame boardGame) {
        boardGameList.add(boardGame);
    }

    public boolean removeBoardGame(int index) {
        if (index <= boardGameList.size()) {
            boardGameList.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public List<BoardGame> getBoardGameList() {
        return boardGameList;
    }
}