public class Calculator extends javax.swing.JFrame {

  //code
  double num1=0, num2=0;
  String operator = null;
  
  public Calculator() {
      initComponents();
  }

  
  
  private void initComponents() {

      jtxtResult = new javax.swing.JTextField();
      jbtn7 = new javax.swing.JButton();
      jbtn8 = new javax.swing.JButton();
      jbtn9 = new javax.swing.JButton();
      jdiv = new javax.swing.JButton();
      jbtn4 = new javax.swing.JButton();
      jbtn1 = new javax.swing.JButton();
      jbtn2 = new javax.swing.JButton();
      jbtn5 = new javax.swing.JButton();
      jbtn6 = new javax.swing.JButton();
      jbtn73 = new javax.swing.JButton();
      jminus = new javax.swing.JButton();
      jmultiply = new javax.swing.JButton();
      jButton0 = new javax.swing.JButton();
      jdot = new javax.swing.JButton();
      jequal = new javax.swing.JButton();
      jplus = new javax.swing.JButton();
      jback = new javax.swing.JButton();
      jclear = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jtxtResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
      jtxtResult.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jtxtResultActionPerformed(evt);
          }
      });

      jbtn7.setBackground(new java.awt.Color(204, 204, 255));
      jbtn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn7.setText("7");
      jbtn7.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn7ActionPerformed(evt);
          }
      });

      jbtn8.setBackground(new java.awt.Color(204, 204, 255));
      jbtn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn8.setText("8");
      jbtn8.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn8ActionPerformed(evt);
          }
      });

      jbtn9.setBackground(new java.awt.Color(204, 204, 255));
      jbtn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn9.setText("9");
      jbtn9.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn9ActionPerformed(evt);
          }
      });

      jdiv.setBackground(new java.awt.Color(204, 204, 255));
      jdiv.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jdiv.setText("/");
      jdiv.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jdivActionPerformed(evt);
          }
      });

      jbtn4.setBackground(new java.awt.Color(204, 204, 255));
      jbtn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn4.setText("4");
      jbtn4.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn4ActionPerformed(evt);
          }
      });

      jbtn1.setBackground(new java.awt.Color(204, 204, 255));
      jbtn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn1.setText("1");
      jbtn1.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn1ActionPerformed(evt);
          }
      });

      jbtn2.setBackground(new java.awt.Color(204, 204, 255));
      jbtn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn2.setText("2");
      jbtn2.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn2ActionPerformed(evt);
          }
      });

      jbtn5.setBackground(new java.awt.Color(204, 204, 255));
      jbtn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn5.setText("5");
      jbtn5.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn5ActionPerformed(evt);
          }
      });

      jbtn6.setBackground(new java.awt.Color(204, 204, 255));
      jbtn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn6.setText("6");
      jbtn6.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn6ActionPerformed(evt);
          }
      });

      jbtn73.setBackground(new java.awt.Color(204, 204, 255));
      jbtn73.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jbtn73.setText("3");
      jbtn73.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtn73ActionPerformed(evt);
          }
      });

      jminus.setBackground(new java.awt.Color(204, 204, 255));
      jminus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jminus.setText("-");
      jminus.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jminusActionPerformed(evt);
          }
      });

      jmultiply.setBackground(new java.awt.Color(204, 204, 255));
      jmultiply.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jmultiply.setText("*");
      jmultiply.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jmultiplyActionPerformed(evt);
          }
      });

      jButton0.setBackground(new java.awt.Color(204, 204, 255));
      jButton0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jButton0.setText("0");
      jButton0.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jButton0ActionPerformed(evt);
          }
      });

      jdot.setBackground(new java.awt.Color(204, 204, 255));
      jdot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jdot.setText(".");
      jdot.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jdotActionPerformed(evt);
          }
      });

      jequal.setBackground(new java.awt.Color(204, 204, 255));
      jequal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jequal.setText("=");
      jequal.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jequalActionPerformed(evt);
          }
      });

      jplus.setBackground(new java.awt.Color(204, 204, 255));
      jplus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jplus.setText("+");
      jplus.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jplusActionPerformed(evt);
          }
      });

      jback.setBackground(new java.awt.Color(204, 204, 255));
      jback.setText("Back");
      jback.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbackActionPerformed(evt);
          }
      });

      jclear.setBackground(new java.awt.Color(204, 204, 255));
      jclear.setText("Clear");
      jclear.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jclearActionPerformed(evt);
          }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
              .addGap(30, 30, 30)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jtxtResult)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                          .addComponent(jbtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                          .addComponent(jbtn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(jbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(jButton0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                          .addGroup(layout.createSequentialGroup()
                              .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                          .addGroup(layout.createSequentialGroup()
                              .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(4, 4, 4)
                              .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                          .addGroup(layout.createSequentialGroup()
                              .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jbtn73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                          .addGroup(layout.createSequentialGroup()
                              .addComponent(jdot, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(jdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jmultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jminus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jplus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                      .addComponent(jclear, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                      .addComponent(jback, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGap(36, 36, 36))
      );
      layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
              .addGap(20, 20, 20)
              .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jmultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jbtn73, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jminus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jdot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jequal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jplus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jback, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                  .addComponent(jclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addContainerGap(18, Short.MAX_VALUE))
      );

      pack();
  }
  private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {
      // TODO add your handling code here:
  }

  private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {
      
       jtxtResult.setText(jtxtResult.getText()+"7");
  }

  private void jequalActionPerformed(java.awt.event.ActionEvent evt) {
     
      num2 = Double.parseDouble(jtxtResult.getText());
      double answer = 0;
      
      if(operator == "/"){
          answer = num1 /num2;
      }else if(operator == "+"){
          answer = num1+num2;
      }else if(operator == "-"){
          answer = num1-num2;
      }else if(operator == "*"){
          answer = num1*num2;
      }
      jtxtResult.setText(""+answer);
      operator=null;
  }

  private void jmultiplyActionPerformed(java.awt.event.ActionEvent evt) {
       num1 = Double.parseDouble(jtxtResult.getText());
      jtxtResult.setText("");
      operator="*";
  }

  private void jminusActionPerformed(java.awt.event.ActionEvent evt) {
       num1 = Double.parseDouble(jtxtResult.getText());
      jtxtResult.setText("");
      operator="-";
  }

  private void jbackActionPerformed(java.awt.event.ActionEvent evt) {
     String str = jtxtResult.getText();
     jtxtResult.setText(str.substring(0, str.length()-1));
  }

  private void jclearActionPerformed(java.awt.event.ActionEvent evt) {
     jtxtResult.setText("");
  }

  private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {
      jtxtResult.setText(jtxtResult.getText()+"8");
  }

  private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {
       jtxtResult.setText(jtxtResult.getText()+"9");
  }

  private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {
       jtxtResult.setText(jtxtResult.getText()+"4");
  }

  private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {
       jtxtResult.setText(jtxtResult.getText()+"5");
  }

  private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {
       jtxtResult.setText(jtxtResult.getText()+"6");
  }
  private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {
      jtxtResult.setText(jtxtResult.getText()+"1");
  }

  private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {
      jtxtResult.setText(jtxtResult.getText()+"2");
  }

  private void jbtn73ActionPerformed(java.awt.event.ActionEvent evt) {
      jtxtResult.setText(jtxtResult.getText()+"3");
  }

  private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {
       jtxtResult.setText(jtxtResult.getText()+"0");
  }

  private void jdotActionPerformed(java.awt.event.ActionEvent evt) {
       jtxtResult.setText(jtxtResult.getText()+".");
  }

  private void jdivActionPerformed(java.awt.event.ActionEvent evt) {
      num1 = Double.parseDouble(jtxtResult.getText());
      jtxtResult.setText("");
      operator="/";
  }

  private void jplusActionPerformed(java.awt.event.ActionEvent evt) {
       num1 = Double.parseDouble(jtxtResult.getText());
      jtxtResult.setText("");
      operator="+";
  }

  
  public static void main(String args[]) {
     
      try {
          for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
              if ("Nimbus".equals(info.getName())) {
                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;
              }
          }
      } catch (ClassNotFoundException ex) {
          java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
          java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              new Calculator().setVisible(true);
          }
      });
  }

  
  private javax.swing.JButton jButton0;
  private javax.swing.JButton jback;
  private javax.swing.JButton jbtn1;
  private javax.swing.JButton jbtn2;
  private javax.swing.JButton jbtn4;
  private javax.swing.JButton jbtn5;
  private javax.swing.JButton jbtn6;
  private javax.swing.JButton jbtn7;
  private javax.swing.JButton jbtn73;
  private javax.swing.JButton jbtn8;
  private javax.swing.JButton jbtn9;
  private javax.swing.JButton jclear;
  private javax.swing.JButton jdiv;
  private javax.swing.JButton jdot;
  private javax.swing.JButton jequal;
  private javax.swing.JButton jminus;
  private javax.swing.JButton jmultiply;
  private javax.swing.JButton jplus;
  private javax.swing.JTextField jtxtResult;
  
}