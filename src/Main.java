import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final List<Lawn> listOfLawns = new ArrayList<>(5);

	public List<Lawn> getListOfLawns() {
		return listOfLawns;
	}

	static int kilogramsOfcarrotsOnBase = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number of carrots in " + (i + 1) + " lawn: ");
			listOfLawns.add(i, new Lawn(scanner.nextInt()));
		}

		int remainingAttempts = 10;
		int firstPhase = (listOfLawns.get(4).getNumberOfCarrots());

		if (firstPhase < 10) {
			kilogramsOfcarrotsOnBase = 5 * firstPhase;
			remainingAttempts = remainingAttempts - firstPhase;
		} else {
			kilogramsOfcarrotsOnBase = 50;
		}

		if (kilogramsOfcarrotsOnBase < 50) {
			for (int i = 0; i < remainingAttempts; remainingAttempts--) {
				if (listOfLawns.get(0).getNumberOfCarrots() > 0 & listOfLawns.get(3).getNumberOfCarrots() > 0 & kilogramsOfcarrotsOnBase < 50) {
					listOfLawns.get(0).setNumberOfCarrots(listOfLawns.get(0).getNumberOfCarrots() - 1);
					listOfLawns.get(3).setNumberOfCarrots(listOfLawns.get(3).getNumberOfCarrots() - 1);
					kilogramsOfcarrotsOnBase += 5;
				}
				if (kilogramsOfcarrotsOnBase == 50) {
					break;
				}
			}
			for (int i = 0; i < remainingAttempts; remainingAttempts--) {
				if (listOfLawns.get(1).getNumberOfCarrots() > 0 & listOfLawns.get(2).getNumberOfCarrots() > 0 & kilogramsOfcarrotsOnBase < 50) {
					listOfLawns.get(1).setNumberOfCarrots(listOfLawns.get(1).getNumberOfCarrots() - 1);
					listOfLawns.get(2).setNumberOfCarrots(listOfLawns.get(2).getNumberOfCarrots() - 1);
					kilogramsOfcarrotsOnBase += 5;
				}
				if (kilogramsOfcarrotsOnBase == 50) {
					break;
				}
			}

			if (remainingAttempts > 0 & listOfLawns.get(3).getNumberOfCarrots() > 0	) {
				for (int i = 0; i < remainingAttempts; remainingAttempts--) {
					if (kilogramsOfcarrotsOnBase < 50) {
						listOfLawns.get(3).setNumberOfCarrots(listOfLawns.get(3).getNumberOfCarrots() - 1);
						kilogramsOfcarrotsOnBase += 4;
					}
				}
			}
			if (remainingAttempts > 0 & listOfLawns.get(2).getNumberOfCarrots() > 0	) {
				for (int i = 0; i < remainingAttempts; remainingAttempts--) {
					listOfLawns.get(2).setNumberOfCarrots(listOfLawns.get(2).getNumberOfCarrots() - 1);
					kilogramsOfcarrotsOnBase += 3;
				}
			}
			if (remainingAttempts > 0 & listOfLawns.get(1).getNumberOfCarrots() > 0	) {
				for (int i = 0; i < remainingAttempts; remainingAttempts--) {
					listOfLawns.get(1).setNumberOfCarrots(listOfLawns.get(1).getNumberOfCarrots() - 1);
					kilogramsOfcarrotsOnBase += 2;
				}
			}
			if (remainingAttempts > 0 & listOfLawns.get(0).getNumberOfCarrots() > 0	) {
				for (int i = 0; i < remainingAttempts; remainingAttempts--) {
					listOfLawns.get(0).setNumberOfCarrots(listOfLawns.get(0).getNumberOfCarrots() - 1);
					kilogramsOfcarrotsOnBase += 1;
				}
			}
		}

		System.out.println(kilogramsOfcarrotsOnBase + " kilograms of carrots captured");
	}
}