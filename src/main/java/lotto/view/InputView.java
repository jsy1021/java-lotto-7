package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public int inputPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    public String inputWinningNumbers() {
        System.out.println("\n당첨 번호를 입력해 주세요.");
        return Console.readLine();
    }

    public int inputBonusNumber() {
        System.out.println("\n보너스 번호를 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }
}
