package javastart.stream;

import org.junit.Assert;
import org.junit.Test;

public class ShopTestSuite {

    @Test
    public void testAddAndGetBoardGame() {
        //Given
        Shop underTest = new Shop();
        BoardGame game1 = new BoardGame("K2", 29.99, 2, 90, 6, 0.10);
        BoardGame game2 = new BoardGame("Monopoly", 35.99, 4, 105, 5, 0.05);

        //When
        underTest.addBoardGame(game1);
        underTest.addBoardGame(game2);
        BoardGame boardGame1 = underTest.getBoardGameList().get(0);
        BoardGame boardGame2 = underTest.getBoardGameList().get(1);
        int boardGameListSize = underTest.getBoardGameList().size();

        //Then
        Assert.assertEquals(boardGame1, game1);
        Assert.assertEquals(boardGame2, game2);
        Assert.assertEquals(2,boardGameListSize);
    }

    @Test
    public void testRemoveBoardGame() {
        //Given
        Shop underTest = new Shop();
        BoardGame game1 = new BoardGame("The game", 20, 2, 100, 5, 0.09);

        //When
        underTest.addBoardGame(game1);
        boolean result = underTest.removeBoardGame(0);

        //Then
        Assert.assertTrue(result);
    }

}