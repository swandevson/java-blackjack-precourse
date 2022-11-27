package domain;



public class InputValidator {
    private final static String PLAYERS_REGEX = "^[a-zA-zㄱ-ㅎㅏ-ㅣ가-힣0-9,]*[a-zA-zㄱ-ㅎㅏ-ㅣ가-힣0-9]$";
    private final static String MONEY_REGEX = "^[0-9]+";
    private final static String SELECTION_YES = "y";
    private final static String SELECTION_NO = "n";


    public static void validatePlayersInput(String input) throws IllegalArgumentException {
        if (!input.matches(PLAYERS_REGEX)) {
            throw new IllegalArgumentException("잘못된 플레이어 입력");
        }
    }

    public static void validateBettingMoney(String input) throws IllegalArgumentException {
        if (!input.matches(MONEY_REGEX)) {
            throw new IllegalArgumentException("잘못된 돈 입력");
        }
    }

    public static void validateSelection(String input) throws IllegalArgumentException {
        if (!input.equals(SELECTION_YES) && !input.equals(SELECTION_NO)) {
            throw new IllegalArgumentException("잘못된 선택 입력");
        }
    }
}
