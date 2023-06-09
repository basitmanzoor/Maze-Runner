/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HomeMaze;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author BasitCJ
 */
public class adminMaze extends javax.swing.JFrame {

    /**
     * Creates new form adminMaze
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int[][] maze =
                           {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                            {1,0,1,0,1,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,1,1,1},
                            {1,0,1,0,0,0,1,1,0,0,1,0,1,1,1,1,1,0,0,1,0,1,1},
                            {1,0,1,1,1,0,1,1,0,0,1,0,1,1,1,1,1,1,0,0,1,0,1},
                            {1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,0,0,1,0,1,1,1},
                            {1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                            {1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,1},
                            {1,1,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,0,0,1,0,1,1},
                            {1,1,0,1,1,1,1,1,1,0,0,0,1,1,0,1,1,1,0,0,1,0,1},
                            {1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1},
                            {1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1,1,1},
                            {1,1,0,1,1,0,0,0,0,0,1,1,1,1,1,1,0,1,1,1,1,1,1},
                            {1,1,0,1,1,1,1,1,1,0,0,0,1,1,1,0,0,0,1,1,1,1,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1},
                            {1,0,1,0,1,1,1,1,1,1,0,0,1,1,1,0,0,0,0,0,1,1,1},
                            {1,0,1,0,0,0,1,1,0,0,1,0,1,1,1,1,1,1,1,0,1,1,1},
                            {1,0,1,1,1,0,1,1,0,0,1,0,1,1,1,1,1,1,1,0,1,1,1},
                            {1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0,0,0,0,0,1,1,1},
                            {1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,1,1,1,0,0,9,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                            };
    public ArrayList<Integer> path = new ArrayList<>();//for storing the coordinates on my path

    public adminMaze(){
        setTitle("Blade Runner Maze Game");
        setSize(800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400,100);
        DFS.searchpath(maze, 1,1,path);
        System.out.println(path);
    }

    @Override
    public void paint(Graphics g){
        g.translate(50,50);
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                Color color;
                switch (maze[i][j]){
                    case 1 : color = Color.BLACK; break;
                    case 9 : color = Color.RED; break;
                    default : color = Color.WHITE; break;
                }
                g.setColor(color);
                g.fillRect(30*j, 30*i, 30,30);
                g.setColor(Color.RED);
                g.drawRect(30*j,30*i,30,30);

            }
        }

        for(int i=0; i<path.size(); i+=2){
            int pathx = path.get(i);
            int pathy = path.get(i+1);
            System.out.println("x coordinates" +pathx);
            System.out.println("y coordinates" +pathy);

            g.setColor(Color.GREEN);
            g.fillRect(30*pathx, 30*pathy, 30,30);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(adminMaze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminMaze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminMaze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminMaze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminMaze().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
