package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public static boolean upPressed, downPressed, leftPressed, rightPressed, pausePressed;

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this implementation
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        // Handle movement keys
        if (code == KeyEvent.VK_W) {
            upPressed = true; // Rotate or move up
        }
        if (code == KeyEvent.VK_S) {
            downPressed = true; // Move down faster
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = true; // Move left
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = true; // Move right
        }

        // Handle pause key
        if (code == KeyEvent.VK_ESCAPE) {
            pausePressed = !pausePressed; // Toggle pause state
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}