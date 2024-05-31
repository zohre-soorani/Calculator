
package calculator;

import java.util.*;


public class MainPage extends javax.swing.JFrame {

    private LinkedList<String> list = new LinkedList<>();
    boolean isFirst= true;

    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        key_7 = new javax.swing.JButton();
        key_8 = new javax.swing.JButton();
        key_9 = new javax.swing.JButton();
        key_div = new javax.swing.JButton();
        key_4 = new javax.swing.JButton();
        key_5 = new javax.swing.JButton();
        key_6 = new javax.swing.JButton();
        key_mult = new javax.swing.JButton();
        key_1 = new javax.swing.JButton();
        key_2 = new javax.swing.JButton();
        key_3 = new javax.swing.JButton();
        key_sub = new javax.swing.JButton();
        key_parenthesis = new javax.swing.JButton();
        key_0 = new javax.swing.JButton();
        key_equal = new javax.swing.JButton();
        key_sum = new javax.swing.JButton();
        key_pow = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        key_AC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TextField = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        key_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        key_7.setText("7");
        key_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_7MouseClicked(evt);
            }
        });

        key_8.setText("8");
        key_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_8MouseClicked(evt);
            }
        });

        key_9.setText("9");
        key_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_9MouseClicked(evt);
            }
        });

        key_div.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        key_div.setText("/");
        key_div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_divMouseClicked(evt);
            }
        });

        key_4.setText("4");
        key_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_4MouseClicked(evt);
            }
        });

        key_5.setText("5");
        key_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_5MouseClicked(evt);
            }
        });

        key_6.setText("6");
        key_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_6MouseClicked(evt);
            }
        });

        key_mult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        key_mult.setText("*");
        key_mult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_multMouseClicked(evt);
            }
        });

        key_1.setText("1");
        key_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_1MouseClicked(evt);
            }
        });

        key_2.setText("2");
        key_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_2MouseClicked(evt);
            }
        });

        key_3.setText("3");
        key_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_3MouseClicked(evt);
            }
        });

        key_sub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        key_sub.setText("-");
        key_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_subMouseClicked(evt);
            }
        });

        key_parenthesis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        key_parenthesis.setText("( )");
        key_parenthesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_parenthesisMouseClicked(evt);
            }
        });

        key_0.setText("0");
        key_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_0MouseClicked(evt);
            }
        });

        key_equal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        key_equal.setText("=");
        key_equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_equalMouseClicked(evt);
            }
        });

        key_sum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        key_sum.setText("+");
        key_sum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_sumMouseClicked(evt);
            }
        });

        key_pow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        key_pow.setText("^");
        key_pow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_powMouseClicked(evt);
            }
        });

        jButton18.setPreferredSize(new java.awt.Dimension(36, 5));

        key_AC.setText("AC");
        key_AC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_ACMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        TextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TextField.setText("0");
        TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        key_delete.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        key_delete.setText("Delete");
        key_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key_deleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(key_4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(key_1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(key_5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(key_6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(key_2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(key_3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(key_7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(key_8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(key_9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(key_parenthesis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(key_pow, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(key_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(key_AC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(key_0, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(5, 5, 5)
                                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(key_div, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(key_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(key_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(key_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(key_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(4, 4, 4)))
                                                .addGap(0, 10, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(key_parenthesis, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(key_pow, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(key_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(key_AC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(key_8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(key_9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(key_7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(key_4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(key_5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(key_6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(key_1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(key_2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(key_3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(key_0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(key_div, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(key_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(key_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(key_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(3, 3, 3)
                                                        .addComponent(key_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void key_0MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("0");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("0");
            } else if (list.getLast() == "/" || list.getLast() == ")") {
                TextField.setText("Invalid format used!");
            } else {
                TextField.setText(TextField.getText() + "0");
                list.add("0");
            }
        }
    }

    private void key_1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("1");
            list.add("1");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("1");

            } else if (list.getLast() == ")") {
                TextField.setText(TextField.getText() + "*1");
                list.add("*");

            } else {
                TextField.setText(TextField.getText() + "1");
            }
            list.add("1");
        }
    }

    private void key_2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("2");
            list.add("2");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("2");

            } else if (list.getLast() == ")") {
                TextField.setText(TextField.getText() + "*2");
                list.add("*");

            } else {
                TextField.setText(TextField.getText() + "2");
            }
            list.add("2");
        }
    }

    private void key_3MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("3");
            list.add("3");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("3");

            } else if (list.getLast() == ")") {
                TextField.setText(TextField.getText() + "*3");
                list.add("*");

            } else {
                TextField.setText(TextField.getText() + "3");
            }
            list.add("3");
        }
    }

    private void key_4MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("4");
            list.add("4");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("4");

            } else if (list.getLast() == ")") {
                TextField.setText(TextField.getText() + "*4");
                list.add("*");

            } else {
                TextField.setText(TextField.getText() + "4");
            }
            list.add("4");
        }
    }

    private void key_5MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("5");
            list.add("5");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("5");

            } else if (list.getLast() == ")") {
                TextField.setText(list.getLast() + "*5");
                list.add("*");

            } else {
                TextField.setText(TextField.getText() + "5");
            }
            list.add("5");
        }
    }

    private void key_6MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("6");
            list.add("6");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("6");

            } else if (list.getLast() == ")") {
                TextField.setText(TextField.getText() + "*6");
                list.add("*");

            } else {
                TextField.setText(TextField.getText() + "6");
            }
            list.add("6");
        }
    }

    private void key_7MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("7");
            list.add("7");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("7");

            } else if (list.getLast() == ")") {
                TextField.setText(TextField.getText() + "*7");
                list.add("*");

            } else {
                TextField.setText(TextField.getText() + "7");
            }
            list.add("7");
        }
    }

    private void key_8MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("8");
            list.add("8");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("8");

            } else if (list.getLast() == ")") {
                TextField.setText(TextField.getText() + "*8");
                list.add("*");

            } else {
                TextField.setText(TextField.getText() + "8");
            }
            list.add("8");
        }
    }

    private void key_9MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (list.size() == 1 && isFirst == false){
            list.remove();
            TextField.setText("9");
            list.add("9");
            isFirst = true;
        }else {
            if (TextField.getText() == "0") {
                TextField.setText("9");

            } else if (list.getLast() == ")") {
                TextField.setText(TextField.getText() + "*9");
                list.add("*");

            } else {
                list.add("9");
                TextField.setText(TextField.getText() + "9");
            }
            list.add("9");
        }
    }

    private void key_ACMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        while (!list.isEmpty())
            list.remove();
        TextField.setText("0");
        isFirst = true;

    }

    private void key_equalMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        int x = parenthesesChecker(list);
        if (x > 0){
            for (int i = 0; i < x; i++) {
                TextField.setText(TextField.getText() + ")");
                list.add(")");
            }
        }

        long answer = operationRPN(postfix(TextField.getText()));
        TextField.setText(Long.toString(answer));

        while (!list.isEmpty())
            list.remove();

        list.add(Long.toString(answer));
        isFirst = false;

    }

    private void key_sumMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (TextField.getText() == "0") {
            TextField.setText("Invalid format used!");

        } else if (list.getLast() == "+" || list.getLast() == "*" ||
                list.getLast() == "/" || list.getLast() == "(" ||
                list.getLast() == "-" || list.getLast() == "^") {
            list.removeLast();
            String text = TextField.getText();
            text = text.substring(0, (text.length() - 1));
            TextField.setText(text + "+");
            list.add("+");

        } else {
            list.add("+");
            TextField.setText(TextField.getText() + "+");
        }
    }

    private void key_subMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (TextField.getText() == "0") {
            TextField.setText("Invalid format used!");
        } else if (list.getLast() == "+" || list.getLast() == "*" ||
                list.getLast() == "/" || list.getLast() == "(" ||
                list.getLast() == "-" || list.getLast() == "^") {
            list.removeLast();
            String text = TextField.getText();
            text = text.substring(0, (text.length() - 1));
            TextField.setText(text + "-");
            list.add("-");

        } else {
            list.add("-");
            TextField.setText(TextField.getText() + "-");
        }
    }

    private void key_parenthesisMouseClicked(java.awt.event.MouseEvent evt) {

        // TODO add your handling code here:
        if (TextField.getText() == "0") {
            TextField.setText("(");
            list.add("(");

        } else if (list.getLast() == "(" || list.getLast() == "+"
                || list.getLast() == "-" || list.getLast() == "*"
                || list.getLast() == "/" || list.getLast() == "^") {

            TextField.setText(TextField.getText() + "(");
            list.add("(");

        } else if (parenthesesChecker(list) == 0) {
            TextField.setText(TextField.getText() + "*(");
            list.add("*");
            list.add("(");

        } else if (parenthesesChecker(list) > 0) {
            TextField.setText(TextField.getText() + ")");
            list.add(")");

        }
    }

    private void key_powMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (TextField.getText() == "0") {
            TextField.setText("Invalid format used!");
        } else if (list.getLast() == "+" || list.getLast() == "*" ||
                list.getLast() == "/" || list.getLast() == "(" ||
                list.getLast() == "-" || list.getLast() == "^") {
            list.removeLast();
            String text = TextField.getText();
            text = text.substring(0, (text.length() - 1));
            TextField.setText(text + "^");
            list.add("^");

        } else {
            list.add("^");
            TextField.setText(TextField.getText() + "^");
        }
    }

    private void key_multMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (TextField.getText() == "0") {
            TextField.setText("Invalid format used!");
        } else if (list.getLast() == "+" || list.getLast() == "*" ||
                list.getLast() == "/" || list.getLast() == "(" ||
                list.getLast() == "-" || list.getLast() == "^") {
            list.removeLast();
            String text = TextField.getText();
            text = text.substring(0, (text.length() - 1));
            TextField.setText(text + "*");
            list.add("*");

        } else {
            list.add("*");
            TextField.setText(TextField.getText() + "*");
        }
    }

    private void key_divMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (TextField.getText() == "0") {
            TextField.setText("Invalid format used!");

        } else if (list.getLast() == "+" || list.getLast() == "*" ||
                list.getLast() == "/" || list.getLast() == "(" ||
                list.getLast() == "-" || list.getLast() == "^") {
            list.removeLast();
            String text = TextField.getText();
            text = text.substring(0, (text.length() - 1));
            TextField.setText(text + "/");
            list.add("/");

        } else {
            list.add("/");
            TextField.setText(TextField.getText() + "/");
        }
    }

    private void key_deleteMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        if (TextField.getText() == "0" || list.isEmpty()) {
            TextField.setText("0");
        } else {
            list.removeLast();
            if (list.size() == 0)
                TextField.setText("0");
            else {
                String text = TextField.getText();
                text = text.substring(0, (text.length() - 1));
                TextField.setText(text);
            }
        }
    }

    private int parenthesesChecker(LinkedList<String> linkedList) {
        int x = 0;
        if (!linkedList.isEmpty()) {
            for (int i = 0; i < linkedList.size(); i++) {
                if (linkedList.get(i) == "(")
                    x++;
                else if (linkedList.get(i) == ")")
                    x--;
            }
        }
        return x;
    }


    public static Queue<String> postfix(String str) { // Convert infix to postfix

        Stack<String> stack = new Stack<>(); // A stack to place operators inside
        Queue<String> queue = new LinkedList<>(); // Auxiliary queue if bracketed
        Queue<String> queueBracket = new LinkedList<>(); // Queue to place operators and operands in postfix

        String c1 = "", c2 = "", number = ""; // c1 character to get data from the input & c2 character to get data from the stack

        for (int i = 0; i < str.length(); i++) {

            c1 = String.valueOf(str.charAt(i));

            if (c1.equals("+") || c1.equals("-")) { // operator + or -

                while (!c2.equals("(") && !c2.equals("")) { // Checking the precedence of the operator inside the stack with the input operator

                    queue.add(String.valueOf(stack.pop())); // Add a high-priority operator to the queue

                    if (!stack.isEmpty()) {
                        c2 = stack.pop();
                        stack.push(c2);
                    } else {
                        break;
                    }
                }

                stack.push(c1);
                c2 = c1;

            } else if (c1.equals("*") || c1.equals("/")) { // operator * or /

                while (!c2.equals("(") && !c2.equals("") && !c2.equals("+") && !c2.equals("-")) { // Checking the precedence of the operator inside the stack with the input operator

                    queue.add(String.valueOf(stack.pop())); // Add a high-priority operator to the queue

                    if (!stack.isEmpty()) {
                        c2 = stack.pop();
                        stack.push(c2);
                    } else {
                        break;
                    }
                }

                stack.push(c1);
                c2 = c1;

            } else if (c1.equals("^")) { // operator ^

                while (!c2.equals("(") && !c2.equals("") && !c2.equals("+") && !c2.equals("-") && !c2.equals("*") && !c2.equals("/")) { // Checking the precedence of the operator inside the stack with the input operator

                    queue.add(String.valueOf(stack.pop())); // Add a high-priority operator to the queue

                    if (!stack.isEmpty()) {
                        c2 = stack.pop();
                        stack.push(c2);
                    } else {
                        break;
                    }
                }

                stack.push(c1);
                c2 = c1;

            } else if (c1.equals("(")) { // bracket ( )

                int j = str.length() - 1, place;

                while (j >= 0) {
                    if (str.charAt(j) == ')') { // Find the last bracket to match the first bracket
                        place = j;
                        break;
                    }

                    j--;
                }
                queueBracket = postfix(str.substring(i + 1, j)); // Calculate inside brackets

                while (!queueBracket.isEmpty()) {
                    queue.add(queueBracket.remove());
                }

                i = j; // Place the index after the last bracket

            } else {

                int k = i + 1;
                number += c1;

                if (!(k <= str.length() - 1 && str.charAt(k) >= '0' && str.charAt(k) <= '9')) {
                    queue.add(number);
                    number = "";
                }
            }

            if (str.length() - 1 == i) { // Add the remaining operators on the stack to the queue

                while (!stack.isEmpty())
                    queue.add(String.valueOf(stack.pop()));
            }
        }
        return queue;
    }

    public static long operationRPN(Queue<String> queue) { // Calculation of mathematical operations by RPN method

        long total = 0, number1 = 0, number2 = 0, counter = queue.size();

        Stack<Long> recive = new Stack<>();
        Scanner scanner;

        for (int i = 0; i < counter; i++) {

            String data = queue.remove();

            switch (data) {

                case "+": // operator +

                    number1 = recive.pop();
                    number2 = recive.pop();

                    total = number2 + number1;

                    recive.push(total);

                    break;

                case "-": // operator -

                    number1 = recive.pop();
                    number2 = recive.pop();

                    total = number2 - number1;

                    recive.push(total);

                    break;

                case "*": // operator *

                    number1 = recive.pop();
                    number2 = recive.pop();

                    total = number2 * number1;

                    recive.push(total);

                    break;

                case "/": // operator /

                    number1 = recive.pop();
                    number2 = recive.pop();

                    total = number2 / number1;

                    recive.push(total);

                    break;

                case "^": // operator ^

                    number1 = recive.pop();
                    number2 = recive.pop();

                    total = (long) Math.pow(number2, number1);

                    recive.push(total);

                    break;

                default: // push number

                    scanner = new Scanner(data);

                    long num = scanner.nextInt();

                    recive.push(num);

                    break;
            }
        }
        return recive.pop(); // pop result and return
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel TextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton key_0;
    private javax.swing.JButton key_1;
    private javax.swing.JButton key_2;
    private javax.swing.JButton key_3;
    private javax.swing.JButton key_4;
    private javax.swing.JButton key_5;
    private javax.swing.JButton key_6;
    private javax.swing.JButton key_7;
    private javax.swing.JButton key_8;
    private javax.swing.JButton key_9;
    private javax.swing.JButton key_AC;
    private javax.swing.JButton key_delete;
    private javax.swing.JButton key_div;
    private javax.swing.JButton key_equal;
    private javax.swing.JButton key_mult;
    private javax.swing.JButton key_parenthesis;
    private javax.swing.JButton key_pow;
    private javax.swing.JButton key_sub;
    private javax.swing.JButton key_sum;
    // End of variables declaration
}
