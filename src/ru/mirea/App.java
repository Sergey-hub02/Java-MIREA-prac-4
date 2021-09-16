package ru.mirea;

import java.awt.*;
import javax.swing.*;


public class App extends JFrame {
  private static final int windowWidth = 350;           // ширина окна
  private static final int windowHeight = 200;          // выстота окна
  private static final String windowTitle = "Real Madrid vs AC Milan";    // заголовок окна

  private static final Font windowFont = new Font("Ubuntu Mono", Font.BOLD, 25);  // оформление шрифта


  /**
   * Создаёт окно, имитирующее таблицу результатов матчей
   */
  private App() {
    super(windowTitle);

    setSize(windowWidth, windowHeight);
    setLayout(new BorderLayout());

    JLabel score = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    JButton acMilan = new JButton("AC Milan");
    JButton realMadrid = new JButton("Real Madrid");
    JLabel lastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    score.setFont(windowFont);
    acMilan.setFont(windowFont);
    realMadrid.setFont(windowFont);
    lastScorer.setFont(windowFont);
    winner.setFont(windowFont);

    JPanel centerPanel = new JPanel();              // центральная панель
    centerPanel.setLayout(new FlowLayout());

    centerPanel.add(acMilan);
    centerPanel.add(realMadrid);

    JPanel bottomPanel = new JPanel();             // нижняя панель
    bottomPanel.setLayout(new GridLayout(2, 1));
    bottomPanel.add(lastScorer);
    bottomPanel.add(winner);

    add(score, BorderLayout.NORTH);
    add(centerPanel, BorderLayout.CENTER);
    add(bottomPanel, BorderLayout.SOUTH);
  }

  /**
   * Запускает приложение
   * @param args        аргументы командной строки
   */
  public static void main(String[] args) {
    App window = new App();

    window.setVisible(true);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}