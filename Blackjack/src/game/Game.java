package game;

import java.awt.EventQueue;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Game extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	
	public LinkedList<Card> generateDeck(int numDecks) {
		LinkedList<Card> deck = new LinkedList<>();
		while (numDecks > 0) {
			for (int i = 1; i <= 13; i++) {
				String type = "" + i;
				if (i == 1) type = "A";
				else if (i == 11) type = "J";
				else if (i == 12) type = "Q";
				else if (i == 13) type = "K";
				for (int j = 0; i < 4; i++) {
					String suit;
					if (j == 0) suit = "H";
					else if (j == 1) suit = "D";
					else if (j == 2) suit = "C";
					else suit = "S";
					deck.add(new Card(type, suit));
				}
			}
			numDecks--;
		}
		return deck;
	}

}
