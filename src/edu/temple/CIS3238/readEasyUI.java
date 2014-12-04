/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.temple.CIS3238;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author David
 */
public class readEasyUI extends JFrame {
    
    private static Thread threadObject;
    private static AtomicBoolean paused = new AtomicBoolean(true);
    private static File userFile;
    private static String[] docText;
    private static Color letterColor = Color.red;
    private static long sleepTime = 1000;
    String wpm;
    
    public readEasyUI() throws FileNotFoundException {
        initComponents();
        int red = 238;
        int green = 238;
        int blue = 238;
        
        
        float[] hsb = Color.RGBtoHSB(red, green, blue, null);
        float hue = hsb[0];
        float saturation = hsb[1];
        float brightness = hsb[2];
        textA1.setBackground(Color.getHSBColor(hue, saturation, brightness));
        
        textA2.setBackground(Color.getHSBColor(hue, saturation, brightness));
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        colorChooser = new javax.swing.JColorChooser();
        focusWordFirstL = new javax.swing.JLabel();
        focusLetterL = new javax.swing.JLabel();
        focusWordEndL = new javax.swing.JLabel();
        searchL = new javax.swing.JLabel();
        wpmL = new javax.swing.JLabel();
        etaL = new javax.swing.JLabel();
        etaTime = new javax.swing.JLabel();
        totalWordsLeft = new javax.swing.JLabel();
        wordsL = new javax.swing.JLabel();
        searchTF = new java.awt.TextField();
        playB = new javax.swing.JButton();
        pauseB = new javax.swing.JButton();
        scrollP1 = new javax.swing.JScrollPane();
        scrollP2 = new javax.swing.JScrollPane();
        textA2 = new javax.swing.JTextArea();
        wpmComboBox = new javax.swing.JComboBox();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        exitFile = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        wpmSet = new javax.swing.JMenuItem();
        timerSet = new javax.swing.JMenuItem();
        colorMenu = new javax.swing.JMenu();
        redColor = new javax.swing.JMenuItem();
        greenColor = new javax.swing.JMenuItem();
        blueColor = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogTitle("ReadEasy");
        fileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        focusWordFirstL.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        focusWordFirstL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        focusWordFirstL.setText("Rea");
        focusWordFirstL.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        focusLetterL.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        focusLetterL.setForeground(new java.awt.Color(255, 0, 0));
        focusLetterL.setText("d");

        focusWordEndL.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        focusWordEndL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        focusWordEndL.setText("Easy");
        focusWordEndL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        searchL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchL.setText("Search");

        wpmL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wpmL.setText("WPM:");

        etaL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etaL.setText("ETA:");

        etaTime.setText("N/a");

        totalWordsLeft.setText("0");

        wordsL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        wordsL.setText("Words");

        searchTF.setText("textField1");
        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });

        playB.setText("Play");
        playB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBActionPerformed(evt);
            }
        });

        pauseB.setText("Pause");
        pauseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBActionPerformed(evt);
            }
        });

        textA1.setColumns(20);
        textA1.setLineWrap(true);
        textA1.setRows(5);
        textA1.setWrapStyleWord(true);
        textA1.setAutoscrolls(false);
        textA1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.UIManager.getDefaults().getColor("Button.background"), javax.swing.UIManager.getDefaults().getColor("Button.background")));
        textA1.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        textA1.setDisabledTextColor(new java.awt.Color(51, 0, 51));
        textA1.setDoubleBuffered(true);
        scrollP1.setViewportView(textA1);

        textA2.setColumns(20);
        textA2.setLineWrap(true);
        textA2.setRows(5);
        textA2.setWrapStyleWord(true);
        textA2.setAutoscrolls(false);
        scrollP2.setViewportView(textA2);

        wpmComboBox.setEditable(true);
        wpmComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "250", "300", "350", "400", "450", "500", "550" }));
        wpmComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wpmComboBoxActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        fileMenu.add(openFile);

        exitFile.setText("Exit");
        exitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileActionPerformed(evt);
            }
        });
        fileMenu.add(exitFile);

        menuBar.add(fileMenu);

        settingsMenu.setText("Settings");

        wpmSet.setText("WPM");
        wpmSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wpmSetActionPerformed(evt);
            }
        });
        settingsMenu.add(wpmSet);

        timerSet.setText("Timer");
        settingsMenu.add(timerSet);

        colorMenu.setText("Color");

        redColor.setText("Red");
        redColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redColorActionPerformed(evt);
            }
        });
        colorMenu.add(redColor);

        greenColor.setText("Green");
        greenColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenColorActionPerformed(evt);
            }
        });
        colorMenu.add(greenColor);

        blueColor.setText("Blue");
        blueColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueColorActionPerformed(evt);
            }
        });
        colorMenu.add(blueColor);

        settingsMenu.add(colorMenu);

        menuBar.add(settingsMenu);

        helpMenu.setText("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollP1)
            .addComponent(scrollP2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(focusWordFirstL, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(focusLetterL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(focusWordEndL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(wordsL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalWordsLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pauseB)
                .addGap(141, 141, 141)
                .addComponent(etaL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(etaTime, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wpmL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wpmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchL)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollP1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(focusWordFirstL)
                    .addComponent(focusWordEndL)
                    .addComponent(focusLetterL))
                .addGap(18, 18, 18)
                .addComponent(scrollP2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etaL)
                        .addComponent(wordsL)
                        .addComponent(totalWordsLeft)
                        .addComponent(playB)
                        .addComponent(pauseB))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etaTime)
                        .addComponent(wpmL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(wpmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_exitFileActionPerformed
    
    private void wpmSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wpmSetActionPerformed
        
    }//GEN-LAST:event_wpmSetActionPerformed
    
    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTFActionPerformed
    
    private void playBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBActionPerformed
        if (paused.get()) {
            
            paused.set(false);
        }
        synchronized (threadObject) {
            threadObject.notify();
        }
    }//GEN-LAST:event_playBActionPerformed
    
    private void pauseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBActionPerformed
        if (!paused.get()) {
            
            paused.set(true);
        }
        synchronized (threadObject) {
            threadObject.notify();
        }
        setETA();
        
    }//GEN-LAST:event_pauseBActionPerformed
    
    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        
        int returnVal = fileChooser.showOpenDialog(this);
        if(returnVal == fileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                //Display File in TextArea
                //textA2.read(new FileReader(file.getAbsolutePath()), null);
                if(Utils.getExtension(file).equals("doc")) {
                    docText = readMyDocument(file.getAbsolutePath());
                    textA2.setText(docText.toString());
                    
                }
                else if(Utils.getExtension(file).equals("txt")) {
                    userFile = file;
                    threadObject.start();
                }
                
            } catch (Exception ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        }        
    }//GEN-LAST:event_openFileActionPerformed
        
    private void greenColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenColorActionPerformed
        
        letterColor = Color.green;
        focusLetterL.setForeground(letterColor);
    }//GEN-LAST:event_greenColorActionPerformed

    private void redColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redColorActionPerformed
        letterColor = Color.red;
        focusLetterL.setForeground(letterColor);
    }//GEN-LAST:event_redColorActionPerformed

    private void wpmComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wpmComboBoxActionPerformed
        wpm = (String) wpmComboBox.getSelectedItem();
        sleepTime = 1000/(Long.parseLong(wpm)/60);
    }//GEN-LAST:event_wpmComboBoxActionPerformed

    private void blueColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueColorActionPerformed
        letterColor = Color.blue;
        focusLetterL.setForeground(letterColor);
    }//GEN-LAST:event_blueColorActionPerformed
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        
        readEasyUI r = null;
        
        r = new readEasyUI();
//        fileMenu.setEnabled(true);
//        exitFile.setEnabled(true);
//        playB.setEnabled(true);
//        pauseB.setEnabled(true);
        
        r.setVisible(true);
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(readEasyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(readEasyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(readEasyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(readEasyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Read in the file and scroll text upon play action */
        Runnable runnable = new Runnable() {
            public void run() {
                Scanner s = null;
                try {
                    s = new Scanner(userFile);
                } catch (Exception ex) {
                    Logger.getLogger(readEasyUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                ArrayList<String> list = new ArrayList<String>();
                
                while (s.hasNext()) {
                    list.add(s.next());
                }
                s.close();
                
                certainIndex c = new certainIndex();
                
                int L = list.size();

                for (int i = 0; i < L; i++) {
                    
                    textA2.setText(list.toString());
                    
                    if (paused.get()) {
                        synchronized (threadObject) {
                            
                            try {
                                threadObject.wait();
                                
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    
                    int focusWord = list.get(i).length();
                    int focusletter = Math.floorDiv(focusWord, 2);
                    String firstPart, focusMid, endPart;
                        firstPart = c.colorFocusedLetter(list.get(i), 0, focusletter);
                        focusMid = Character.toString((list.get(i).charAt(focusletter)));
                        endPart = c.colorFocusedLetter(list.get(i), focusletter + 1, focusWord);
                    
                    for (int b = 0; b < focusWord; b++) {
                        if(list.get(i).length() == 1) {
                            focusWordFirstL.setText("");
                            focusLetterL.setText(focusMid);
                            focusLetterL.setForeground(letterColor);
                            focusWordEndL.setText("");
                            
                        }
                        else if(list.get(i).length() == 2) {
                            focusWordFirstL.setText(Character.toString(list.get(i).charAt(0)));
                            focusLetterL.setText(Character.toString((list.get(i).charAt(1))));
                            focusLetterL.setForeground(letterColor);
                            focusWordEndL.setText("");
                        }
                        else if(list.get(i).length() == 3) {
                            focusWordFirstL.setText(Character.toString(list.get(i).charAt(0)));
                            focusLetterL.setText(Character.toString((list.get(i).charAt(1))));
                            focusLetterL.setForeground(letterColor);
                            focusWordEndL.setText(Character.toString(list.get(i).charAt(2)));
                            
                        }
                        else {
                            focusWordFirstL.setText(firstPart);
                            focusLetterL.setText(focusMid);
                            focusLetterL.setForeground(letterColor);
                            focusWordEndL.setText(endPart);
                        }
                        
                        
                    }
                    
                    textA1.setText(list.get(0));
                    textA1.setText(c.beforeAndAfterLabel(list, 0, i));
                    
                    for (int k = i; k < L; k++) {
                        
                        textA2.setText(c.beforeAndAfterLabel(list, i, L));
                        
                    }
                    
                    try {
                        // Sleep
                        
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(readEasyUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    
                }
                
                
                
                
            }
            
        };
        threadObject = new Thread(runnable);
        
        
    }
    
    
    public void setETA() {
        int words = 200;
        float milliseconds = (words / 250) * 60000;
        int seconds = (int) (milliseconds / 1000) % 60;
        int minutes = (int) ((milliseconds / (1000 * 60)) % 60);
        int hours = (int) ((milliseconds / (1000 * 60 * 60)) % 24);
        if (hours > 0) {
            etaTime.setText(hours + " H " + minutes + " min " + seconds + " sec ");
        } else if (minutes > 0) {
            etaTime.setText(minutes + " min " + seconds + " sec ");
        } else {
            etaTime.setText(seconds + " sec ");
        }
        
    }
    
    private static String[] readMyDocument(String fileName) {
        POIFSFileSystem fs = null;
        String [] text = null;
        try {
            fs = new POIFSFileSystem(new FileInputStream(fileName));
            HWPFDocument doc = new HWPFDocument(fs);
            
            /** Read the content **/
            text = readParagraphs(doc);
            
            int pageNumber=1;
            
            /** We will try reading the header for page 1**/
            //readHeader(doc, pageNumber);
            
            /** Let's try reading the footer for page 1**/
            //readFooter(doc, pageNumber);
            
            /** Read the document summary**/
            //readDocumentSummary(doc);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return text;
    }
    
    private static String[] readParagraphs(HWPFDocument doc) throws Exception{
        WordExtractor we = new WordExtractor(doc);
        
        /**Get the total number of paragraphs**/
        String[] paragraphs = we.getParagraphText();
        System.out.println("Total Paragraphs: "+paragraphs.length);
        
        for (int i = 0; i < paragraphs.length; i++) {
            
            System.out.println("Length of paragraph "+(i +1)+": "+ paragraphs[i].length());
            System.out.println(paragraphs[i].toString());
            
        }
        
        return paragraphs;
        
    }
    
    private static int wpmCalc(int userInput) {
        double value;
        int wpmRet;
        
        value = (userInput / 60);
        wpmRet = (int)(1000 / value);
        
        return wpmRet;
    }
    
    private void setColorLetter(Color c) {
        
        letterColor = c;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem blueColor;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JMenu colorMenu;
    private javax.swing.JLabel etaL;
    private javax.swing.JLabel etaTime;
    private static javax.swing.JMenuItem exitFile;
    private javax.swing.JFileChooser fileChooser;
    private static javax.swing.JMenu fileMenu;
    private static javax.swing.JLabel focusLetterL;
    private static javax.swing.JLabel focusWordEndL;
    private static javax.swing.JLabel focusWordFirstL;
    private javax.swing.JMenuItem greenColor;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openFile;
    private static javax.swing.JButton pauseB;
    private static javax.swing.JButton playB;
    private javax.swing.JMenuItem redColor;
    private javax.swing.JScrollPane scrollP1;
    private javax.swing.JScrollPane scrollP2;
    private javax.swing.JLabel searchL;
    private java.awt.TextField searchTF;
    private javax.swing.JMenu settingsMenu;
    public static final javax.swing.JTextArea textA1 = new javax.swing.JTextArea();
    private static javax.swing.JTextArea textA2;
    private javax.swing.JMenuItem timerSet;
    private javax.swing.JLabel totalWordsLeft;
    private javax.swing.JLabel wordsL;
    private javax.swing.JComboBox wpmComboBox;
    private javax.swing.JLabel wpmL;
    private javax.swing.JMenuItem wpmSet;
    // End of variables declaration//GEN-END:variables
}