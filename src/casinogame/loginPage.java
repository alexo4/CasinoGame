/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casinogame;


import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author aocar
 */
public class loginPage extends javax.swing.JFrame {
    public static ArrayList<usersObject> usersList = new ArrayList<>();
    static String username;
    static String password;
    static int index;
    static Random rand = new Random();
    int card = 0;
    int cardnum = 0;
    static int blackJackCardNum1;
    static int blackJackCardNum2;
    static int blackJackCardNum3=0;
    static int blackJackCardNum4=0;
    static int blackJackCardNum5=0;
    static int blackJackCardNum6=0;
    static int blackJackCardNum7=0;
    static int blackJackCardNum8=0;
    static int blackJackCardNum9=0;
    static int blackJackCardNum10=0;
    static int dealerCardNum1;
    static int dealerCardNum2;
    static int HOLBetAmount;
    static int blackJackBetAmount;
    static int whichPlayerCard = 2;
    static int ace = 0;
    static int cards[] = {0,0,0,0,0,0,0,0,0,0};
    public loginPage() {
        initComponents();
        
        cardImage2.setVisible(false);
        
        usersList = fileHandling.readFile();
        userOrPassError.setVisible(false);
        mainMenu.setVisible(false);
        highOrLowerGame.setVisible(false);
        HOLinsufficientFundsError.setVisible(false);
        blackJackinsufficientFundsError.setVisible(false);
        jPanel2.setVisible(false);
        blackJackCard3.setVisible(false);
        blackJackCard4.setVisible(false);
        blackJackGame.setVisible(false);
        jPanel3.setVisible(false);
        blackJackCard5.setVisible(false);
        blackJackCard6.setVisible(false);
        blackJackCard7.setVisible(false);
        blackJackCard8.setVisible(false);
        blackJackCard9.setVisible(false);
        blackJackCard10.setVisible(false);
        usedUsernameError.setVisible(false);
    }
    public ArrayList<usersObject> registerNewUser(){
        ArrayList<usersObject> usersList = new ArrayList<>();
        usersList = fileHandling.readFile();
        int usedUsername = 0;
        for (int i = 0; i < usersList.size(); i++) {
            if(username.equals(usersList.get(i).username)){
                usedUsername = 1;
            }
        }
        
        if(usedUsername == 1){
            usedUsernameError.setVisible(true);
        }else{
            usersObject newUser = new usersObject(username,password,500);
            newUser.toString();
            usersList.add(newUser);
            fileHandling.writeFile(usersList);
        }
        
        return usersList;
    }
    public void HOLStartGame(){
        
        higherButton.setVisible(true);
        lowerButton.setVisible(true);
        card = rand.nextInt(13)+1;

        cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png")));
        if(card == 1){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/AC.png")));
        }
        else if (card == 2){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/2C.png")));
        }
        else if (card == 3){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/3C.png")));
        }
        else if (card == 4){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/4C.png")));
        }
        else if (card == 5){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/5C.png")));
        }
        else if (card == 6){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/6C.png")));
        }
        else if (card == 7){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/7C.png")));
        }
        else if (card == 8){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/8C.png")));
        }
        else if (card == 9){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/9C.png")));
        }
        else if (card == 10){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/10C.png")));
        }
        else if (card == 11){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/JC.png")));
        }
        else if (card == 12){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/QC.png")));
        }
        else if (card == 13){
            cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/KC.png")));
        }
        cardImage1.setVisible(true);
    }
    
    
    public void HOLFinish(int HigherOrLowerChoice){
        cardnum = rand.nextInt(13)+1;

        if(cardnum == 1){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
        }
        else if (cardnum == 2){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
        }
        else if (cardnum == 3){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
        }
        else if (cardnum == 4){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
        }
        else if (cardnum == 5){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
        }
        else if (cardnum == 6){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
        }
        else if (cardnum == 7){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
        }
        else if (cardnum == 8){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
        }
        else if (cardnum == 9){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
        }
        else if (cardnum == 10){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
        }
        else if (cardnum == 11){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
        }
        else if (cardnum == 12){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
        }
        else if (cardnum == 13){
            cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
        }
        cardImage2.setVisible(true);
        higherButton.setVisible(false);
        lowerButton.setVisible(false);
        
        if(HigherOrLowerChoice == 0){
            if(cardnum>card){
                WLDLabel.setText("You won: "+HOLBetAmount+" chips");
                usersList.get(index).setWallet((usersList.get(index).wallet)+HOLBetAmount);
                HOLEndChips.setText("Chips: "+usersList.get(index).wallet);
            }
            else if(cardnum<card){
                WLDLabel.setText("You Lost: "+HOLBetAmount+" chips"); 
                usersList.get(index).setWallet((usersList.get(index).wallet)-HOLBetAmount);
                HOLEndChips.setText("Chips: "+usersList.get(index).wallet);
            }
            else{
                WLDLabel.setText("You Drew so you lost: "+HOLBetAmount+" chips");
                usersList.get(index).setWallet((usersList.get(index).wallet)-HOLBetAmount);
                HOLEndChips.setText("Chips: "+usersList.get(index).wallet);
            }
        }else{
            if(cardnum<card){
                WLDLabel.setText("You won: "+HOLBetAmount+" chips"); 
                usersList.get(index).setWallet((usersList.get(index).wallet)+HOLBetAmount);
                HOLEndChips.setText("Chips: "+usersList.get(index).wallet);
            }
            else if(cardnum>card){
                WLDLabel.setText("You Lost: "+HOLBetAmount+" chips");   
                usersList.get(index).setWallet((usersList.get(index).wallet)-HOLBetAmount);
                HOLEndChips.setText("Chips: "+usersList.get(index).wallet);
            }
            else{
                WLDLabel.setText("You Drew so you lost: "+HOLBetAmount+" chips");
                usersList.get(index).setWallet((usersList.get(index).wallet)-HOLBetAmount);
                HOLEndChips.setText("Chips: "+usersList.get(index).wallet);
            }
        }
          jPanel2.setVisible(true);
          
        
    }
    
    public void blackJackStartGame(){
        //cards;
        while(true){
            dealerCardNum1 = rand.nextInt(13)+1;
            dealerCardNum2 = rand.nextInt(13)+1;
            if(dealerCardNum1==1 && dealerCardNum2==1){
                cards[0]=11;
                cards[1]=dealerCardNum2;
                break;
            }else if(dealerCardNum1==1){
                cards[0]=11;
                cards[1]=dealerCardNum2;
                break;
            }else if(dealerCardNum2 == 1){
                cards[1]=11;
                cards[0]=dealerCardNum1;
                break;
            }else{
                cards[0]=dealerCardNum1;
                cards[1]=dealerCardNum2;
                break;
            }
        }
        
        
        
        switch (dealerCardNum1) {
            case 1:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                break;
            case 2:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                break;
            case 3:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                break;
            case 4:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                break;
            case 5:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                break;
            case 6:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                break;
            case 7:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                break;
            case 8:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                break;
            case 9:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                break;
            case 10:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                break;
            case 11:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                break;
            case 12:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                break;
            case 13:
                dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                break;
            default:
                break;
        }
        blackJackCardNum1 = rand.nextInt(13)+1;

        switch (blackJackCardNum1) {
            case 1:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                break;
            case 2:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                break;
            case 3:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                break;
            case 4:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                break;
            case 5:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                break;
            case 6:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                break;
            case 7:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                break;
            case 8:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                break;
            case 9:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                break;
            case 10:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                break;
            case 11:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                break;
            case 12:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                break;
            case 13:
                blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                break;
            default:
                break;
        }
        blackJackCardNum2 = rand.nextInt(13)+1;

        switch (blackJackCardNum2) {
            case 1:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                break;
            case 2:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                break;
            case 3:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                break;
            case 4:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                break;
            case 5:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                break;
            case 6:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                break;
            case 7:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                break;
            case 8:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                break;
            case 9:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                break;
            case 10:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                break;
            case 11:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                break;
            case 12:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                break;
            case 13:
                blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                break;
            default:
                break;
        }
        
        cards[2]=blackJackCardNum1;
        cards[4]=blackJackCardNum2;
    }
    
    public int blackJackHandCalc(){
        for (int i = 0; i < 10; i++) {
            if(cards[i] > 10){
                cards[i] = 10;
                
            }
        }

        for (int i = 2; i < 10; i++) {
            if(cards[i]==1){
                cards[i]=11;
                ace++;
                
            }
        }
     
        int playerHandTotal = 0;
        if(ace != 0){
            for (int i = 2; i < 10; i++) {
                playerHandTotal = playerHandTotal + cards[i];
                
            }
            
            int dealerHandTotal = 0;
            for (int i = 0; i < 2; i++) {
                dealerHandTotal = dealerHandTotal + cards[i];
            }
            
            int playerHandValue = 21 - playerHandTotal;
            int dealerHandValue = 21 - dealerHandTotal;
            if(playerHandValue<0){
                playerHandTotal = playerHandTotal - 10;
                
                playerHandValue = 21 - playerHandTotal;
                if(playerHandValue<0){
                    return 2;         
                }else{
                    if(playerHandValue<dealerHandValue){
                        return 0;
                    }else{
                        return 1;
                    }
                }
            }else{
                if(playerHandValue<dealerHandValue){
                    return 0;
                }else{
                    return 1;
                }
            }
        }
        else{
            for (int i = 2; i < 10; i++) {
                playerHandTotal = playerHandTotal + cards[i];
            }
            
            int dealerHandTotal = 0;
            for (int i = 0; i < 2; i++) {
                dealerHandTotal = dealerHandTotal + cards[i];
            }
            
            int playerHandValue = 21 - playerHandTotal;
            int dealerHandValue = 21 - dealerHandTotal;
            if(playerHandValue<0){
                return 2;         
            }else{
                if(playerHandValue<dealerHandValue){
                    return 0;
                }else{
                    return 1;
                }
            }
        
        }
    }
    
    public ArrayList<usersObject> loginUser(){
        ArrayList<usersObject> usersList = new ArrayList<>();
        usersList = fileHandling.readFile();
        
        for (int i = 0; i < usersList.size(); i++) {
            if(username.equals(usersList.get(i).username)){
                index = i;
            }   
        }
        if(password.equals(usersList.get(index).password)){
            
              mainMenu.setVisible(true);
              loginMenu.setVisible(false);
              
              walletText.setText("Chips: "+usersList.get(index).wallet);
        }else{
            userOrPassError.setVisible(true);
        }
        return usersList;
    }
    
    public void resetMainMenu(){
        walletText.setText("Chips: "+usersList.get(index).wallet);
        mainMenu.setVisible(true); 
    }
    
    public void resetHOL(){
        HOLBetAmountFrame.setVisible(true);
        cardImage2.setVisible(false);
        jPanel2.setVisible(false);
        cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png")));
    }
    
    public void blackJackEndGame(){
        switch (dealerCardNum2) {
            case 1:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                break;
            case 2:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                break;
            case 3:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                break;
            case 4:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                break;
            case 5:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                break;
            case 6:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                break;
            case 7:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                break;
            case 8:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                break;
            case 9:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                break;
            case 10:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                break;
            case 11:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                break;
            case 12:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                break;
            case 13:
                dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                break;
            default:
                break;
        }
        int winOrLose = blackJackHandCalc();
        if(winOrLose == 1|| winOrLose == 2){
            WLDLabelBlackJack.setText("You Lost: "+blackJackBetAmount+" chips"); 
            usersList.get(index).setWallet((usersList.get(index).wallet)-HOLBetAmount);
            HOLEndChips.setText("Chips: "+usersList.get(index).wallet);
                        
        }else{
            WLDLabelBlackJack.setText("You won: "+blackJackBetAmount+" chips");
            usersList.get(index).setWallet((usersList.get(index).wallet)+blackJackBetAmount);
            blackJackEndChips.setText("Chips: "+usersList.get(index).wallet);
        }
        jPanel3.setVisible(true);
    }
    public void resetBlackJack(){
        blackJackBetAmountFrame.setVisible(true);
        jPanel3.setVisible(false);
        blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/backOfPlayingCard.png")));
        blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/backOfPlayingCard.png")));
        dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/backOfPlayingCard.png")));
        blackJackCard3.setVisible(false);
        blackJackCard4.setVisible(false);
        blackJackCard5.setVisible(false);
        blackJackCard6.setVisible(false);
        blackJackCard7.setVisible(false);
        blackJackCard8.setVisible(false);
        blackJackCard9.setVisible(false);
        blackJackCard10.setVisible(false);
        whichPlayerCard = 2;
        cards[0]=0;
        cards[1]=0;
        cards[2]=0;
        cards[3]=0;
        cards[4]=0;
        cards[5]=0;
        cards[6]=0;
        cards[7]=0;
        cards[8]=0;
        cards[9]=0;     
        ace = 0;
    }
    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginMenu = new javax.swing.JLayeredPane();
        usedUsernameError = new javax.swing.JLabel();
        userOrPassError = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JFormattedTextField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mainMenu = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        walletText = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        highOrLowerGame = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        HOLEndChips = new javax.swing.JLabel();
        WLDLabel = new javax.swing.JLabel();
        HOLBetAmountFrame = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        HOLBetLabel = new javax.swing.JLabel();
        HOLBetAmountField = new javax.swing.JFormattedTextField();
        HOLConfirmBetButton = new javax.swing.JButton();
        cardImage1 = new javax.swing.JLabel();
        cardImage2 = new javax.swing.JLabel();
        higherButton = new javax.swing.JButton();
        lowerButton = new javax.swing.JButton();
        HOLinsufficientFundsError = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        blackJackGame = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        blackJackEndChips = new javax.swing.JLabel();
        WLDLabelBlackJack = new javax.swing.JLabel();
        blackJackBetAmountFrame = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        blackJackBetLabel = new javax.swing.JLabel();
        blackJackBetAmountField = new javax.swing.JFormattedTextField();
        blackJackConfirmBetButton = new javax.swing.JButton();
        blackJackinsufficientFundsError = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        blackJackCard10 = new javax.swing.JLabel();
        blackJackCard9 = new javax.swing.JLabel();
        blackJackCard7 = new javax.swing.JLabel();
        blackJackCard8 = new javax.swing.JLabel();
        blackJackCard6 = new javax.swing.JLabel();
        blackJackCard3 = new javax.swing.JLabel();
        dealerCard1 = new javax.swing.JLabel();
        blackJackCard5 = new javax.swing.JLabel();
        blackJackCard4 = new javax.swing.JLabel();
        dealerCard2 = new javax.swing.JLabel();
        blackJackCard1 = new javax.swing.JLabel();
        blackJackCard2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        usedUsernameError.setText("Username already in use");
        loginMenu.add(usedUsernameError);
        usedUsernameError.setBounds(90, 330, 220, 14);

        userOrPassError.setText("Please enter a username and password");
        loginMenu.add(userOrPassError);
        userOrPassError.setBounds(90, 330, 240, 14);
        loginMenu.add(passwordField);
        passwordField.setBounds(90, 250, 200, 20);

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        loginMenu.add(usernameField);
        usernameField.setBounds(90, 210, 200, 20);

        loginButton.setText("login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginMenu.add(loginButton);
        loginButton.setBounds(90, 290, 96, 23);

        registerButton.setText("register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        loginMenu.add(registerButton);
        registerButton.setBounds(190, 290, 100, 23);

        jLabel1.setText("username:");
        loginMenu.add(jLabel1);
        jLabel1.setBounds(10, 212, 70, 14);

        jLabel2.setText("password:");
        loginMenu.add(jLabel2);
        jLabel2.setBounds(11, 250, 70, 14);

        getContentPane().add(loginMenu);
        loginMenu.setBounds(50, -40, 500, 430);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("GAMES:");
        mainMenu.add(jLabel3);
        jLabel3.setBounds(109, 62, 112, 59);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Higher or Lower");
        jButton1.setToolTipText("");
        jButton1.setAutoscrolls(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainMenu.add(jButton1);
        jButton1.setBounds(110, 170, 225, 65);

        walletText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        walletText.setText("jLabel4");
        mainMenu.add(walletText);
        walletText.setBounds(1429, 22, 310, 51);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Blackjack");
        jButton4.setToolTipText("");
        jButton4.setAutoscrolls(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        mainMenu.add(jButton4);
        jButton4.setBounds(110, 250, 225, 65);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setText("Exit and Save");
        jButton9.setToolTipText("");
        jButton9.setAutoscrolls(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        mainMenu.add(jButton9);
        jButton9.setBounds(110, 330, 225, 65);

        getContentPane().add(mainMenu);
        mainMenu.setBounds(10, 40, 1770, 470);

        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(42, 455, 350, 132);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Play Again?");
        jButton3.setAutoscrolls(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(42, 605, 350, 132);

        HOLEndChips.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HOLEndChips.setText("jLabel6");
        jPanel2.add(HOLEndChips);
        HOLEndChips.setBounds(91, 37, 169, 92);

        WLDLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WLDLabel.setText("jLabel7");
        jPanel2.add(WLDLabel);
        WLDLabel.setBounds(91, 183, 196, 83);

        highOrLowerGame.add(jPanel2);
        jPanel2.setBounds(600, 40, 450, 760);

        HOLBetAmountFrame.setVisible(true);
        HOLBetAmountFrame.getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("How much woud you like to bet?");
        HOLBetAmountFrame.getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 11, 289, 32);

        HOLBetLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HOLBetAmountFrame.getContentPane().add(HOLBetLabel);
        HOLBetLabel.setBounds(270, 90, 50, 50);

        HOLBetAmountField.setToolTipText("");
        HOLBetAmountField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HOLBetAmountFrame.getContentPane().add(HOLBetAmountField);
        HOLBetAmountField.setBounds(80, 80, 180, 70);

        HOLConfirmBetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HOLConfirmBetButton.setText("confirm");
        HOLConfirmBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOLConfirmBetButtonActionPerformed(evt);
            }
        });
        HOLBetAmountFrame.getContentPane().add(HOLConfirmBetButton);
        HOLConfirmBetButton.setBounds(80, 180, 180, 40);

        highOrLowerGame.add(HOLBetAmountFrame);
        HOLBetAmountFrame.setBounds(640, 240, 350, 260);

        cardImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        highOrLowerGame.add(cardImage1);
        cardImage1.setBounds(40, 80, 510, 810);

        cardImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/AC.png"))); // NOI18N
        highOrLowerGame.add(cardImage2);
        cardImage2.setBounds(1080, 100, 520, 760);

        higherButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        higherButton.setText("HIGHER");
        higherButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                higherButtonMouseClicked(evt);
            }
        });
        higherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                higherButtonActionPerformed(evt);
            }
        });
        highOrLowerGame.add(higherButton);
        higherButton.setBounds(640, 220, 350, 150);

        lowerButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lowerButton.setText("LOWER");
        lowerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerButtonActionPerformed(evt);
            }
        });
        highOrLowerGame.add(lowerButton);
        lowerButton.setBounds(640, 390, 350, 150);

        HOLinsufficientFundsError.setClosable(true);
        HOLinsufficientFundsError.setVisible(true);
        HOLinsufficientFundsError.getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("You don't have sufficient funds");
        HOLinsufficientFundsError.getContentPane().add(jLabel5);
        jLabel5.setBounds(10, -30, 281, 139);

        highOrLowerGame.add(HOLinsufficientFundsError);
        HOLinsufficientFundsError.setBounds(650, 90, 320, 110);

        getContentPane().add(highOrLowerGame);
        highOrLowerGame.setBounds(-20, -40, 1742, 1096);

        jPanel3.setLayout(null);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("Main Menu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(42, 455, 350, 132);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Play Again?");
        jButton8.setAutoscrolls(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(42, 605, 350, 132);

        blackJackEndChips.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        blackJackEndChips.setText("jLabel6");
        jPanel3.add(blackJackEndChips);
        blackJackEndChips.setBounds(91, 37, 169, 92);

        WLDLabelBlackJack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WLDLabelBlackJack.setText("jLabel7");
        jPanel3.add(WLDLabelBlackJack);
        WLDLabelBlackJack.setBounds(91, 183, 196, 83);

        blackJackGame.add(jPanel3);
        jPanel3.setBounds(910, 90, 450, 760);

        blackJackBetAmountFrame.setVisible(true);
        blackJackBetAmountFrame.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("How much woud you like to bet?");
        blackJackBetAmountFrame.getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 11, 289, 32);

        blackJackBetLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        blackJackBetAmountFrame.getContentPane().add(blackJackBetLabel);
        blackJackBetLabel.setBounds(260, 90, 50, 50);

        blackJackBetAmountField.setToolTipText("");
        blackJackBetAmountField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        blackJackBetAmountFrame.getContentPane().add(blackJackBetAmountField);
        blackJackBetAmountField.setBounds(70, 80, 180, 70);

        blackJackConfirmBetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        blackJackConfirmBetButton.setText("confirm");
        blackJackConfirmBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackJackConfirmBetButtonActionPerformed(evt);
            }
        });
        blackJackBetAmountFrame.getContentPane().add(blackJackConfirmBetButton);
        blackJackConfirmBetButton.setBounds(70, 180, 180, 40);

        blackJackGame.add(blackJackBetAmountFrame);
        blackJackBetAmountFrame.setBounds(10, 160, 350, 260);

        blackJackinsufficientFundsError.setClosable(true);
        blackJackinsufficientFundsError.setVisible(true);
        blackJackinsufficientFundsError.getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("You don't have sufficient funds");
        blackJackinsufficientFundsError.getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 10, 281, 38);

        blackJackGame.add(blackJackinsufficientFundsError);
        blackJackinsufficientFundsError.setBounds(20, 20, 320, 110);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Dealer's hand");
        blackJackGame.add(jLabel9);
        jLabel9.setBounds(0, 0, 210, 40);

        blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard10);
        blackJackCard10.setBounds(1840, 530, 500, 710);

        blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard9);
        blackJackCard9.setBounds(1330, 530, 500, 710);

        blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard7);
        blackJackCard7.setBounds(1840, 420, 500, 710);

        blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard8);
        blackJackCard8.setBounds(1330, 420, 500, 710);

        blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard6);
        blackJackCard6.setBounds(1840, 310, 500, 710);

        blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard3);
        blackJackCard3.setBounds(1840, 200, 500, 710);

        dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(dealerCard1);
        dealerCard1.setBounds(10, 90, 500, 710);

        blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard5);
        blackJackCard5.setBounds(1330, 310, 500, 710);

        blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard4);
        blackJackCard4.setBounds(1330, 200, 500, 710);

        dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(dealerCard2);
        dealerCard2.setBounds(520, 90, 500, 710);

        blackJackCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard1);
        blackJackCard1.setBounds(1330, 90, 500, 710);

        blackJackCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinogame/backOfPlayingCard.png"))); // NOI18N
        blackJackGame.add(blackJackCard2);
        blackJackCard2.setBounds(1840, 90, 500, 710);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Your hand");
        blackJackGame.add(jLabel10);
        jLabel10.setBounds(1340, 20, 210, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Stand");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        blackJackGame.add(jButton5);
        jButton5.setBounds(1130, 400, 160, 70);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Hit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        blackJackGame.add(jButton6);
        jButton6.setBounds(1130, 310, 160, 70);

        getContentPane().add(blackJackGame);
        blackJackGame.setBounds(0, 0, 2380, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        userOrPassError.setVisible(false);
        usedUsernameError.setVisible(false);
        if(usernameField.getText().equals("")||passwordField.getText().equals("")){
            userOrPassError.setVisible(true);
        }
        else{
            username = usernameField.getText();
            password = passwordField.getText();
            registerNewUser();
        }
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        userOrPassError.setVisible(false);
        if(usernameField.getText().equals("")||passwordField.getText().equals("")){
            userOrPassError.setVisible(true);
        }else{
            username = usernameField.getText();
            password = passwordField.getText();
            loginUser();
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void higherButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_higherButtonMouseClicked
        int HigherOrLowerChoice = 0;
        HOLFinish(HigherOrLowerChoice);
        
    }//GEN-LAST:event_higherButtonMouseClicked

    private void higherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higherButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_higherButtonActionPerformed

    private void lowerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerButtonActionPerformed
        int HigherOrLowerChoice = 1;
        HOLFinish(HigherOrLowerChoice);
        
    }//GEN-LAST:event_lowerButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        highOrLowerGame.setVisible(true);
        mainMenu.setVisible(false);
        resetHOL();
        HOLStartGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HOLConfirmBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOLConfirmBetButtonActionPerformed
        HOLinsufficientFundsError.setVisible(false);
        if(Integer.parseInt(HOLBetAmountField.getText())>usersList.get(index).wallet){
            HOLinsufficientFundsError.setVisible(true);
        }else{
            HOLBetAmountFrame.setVisible(false);
            HOLBetAmount = Integer.parseInt(HOLBetAmountField.getText());
            HOLStartGame();
        }
    }//GEN-LAST:event_HOLConfirmBetButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        highOrLowerGame.setVisible(false); 
        jPanel2.setVisible(false);
        resetMainMenu();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        resetHOL();
        HOLStartGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void blackJackConfirmBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackJackConfirmBetButtonActionPerformed
        blackJackinsufficientFundsError.setVisible(false);
        if(Integer.parseInt(blackJackBetAmountField.getText())>usersList.get(index).wallet){
            blackJackinsufficientFundsError.setVisible(true);
        }else{
            blackJackBetAmountFrame.setVisible(false);
            blackJackBetAmount = Integer.parseInt(blackJackBetAmountField.getText());
            blackJackStartGame();
        }
    }//GEN-LAST:event_blackJackConfirmBetButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        blackJackGame.setVisible(true);
        mainMenu.setVisible(false);
        blackJackStartGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        whichPlayerCard++;
        if(whichPlayerCard==3){
            while(true){
                int same = 0;
                blackJackCardNum3 = rand.nextInt(13)+1;
                for (int i = 0; i < 4; i++) {
                    if(cards[i] == blackJackCardNum3){
                        same++;
                    }
                }
                if(same!=4){
                    break;
                }
            }
            switch (blackJackCardNum3) {
                case 1:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                    break;
                case 2:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                    break;
                case 3:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                    break;
               case 4:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                    break;
                case 5:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                    break;
                case 6:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                    break;
               case 7:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                    break;
                case 8:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                    break;
                case 9:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                    break;
                case 10:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                    break;
                case 11:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                    break;
                case 12:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                    break;
                case 13:
                    blackJackCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                    break;
                default:
                    break;
            }
            blackJackCard3.setVisible(true);
            cards[3]=blackJackCardNum3;
            if(blackJackHandCalc()== 2){
                blackJackEndGame();
            }
        }
        else if(whichPlayerCard==4){
            while(true){
                int same = 0;
                blackJackCardNum4 = rand.nextInt(13)+1;
                for (int i = 0; i < 5; i++) {
                    if(cards[i] == blackJackCardNum4){
                        same++;
                    }
                }
                if(same!=4){
                    break;
                }
            }
            switch (blackJackCardNum4) {
                case 1:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                    break;
                case 2:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                    break;
                case 3:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                    break;
               case 4:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                    break;
                case 5:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                    break;
                case 6:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                    break;
               case 7:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                    break;
                case 8:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                    break;
                case 9:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                    break;
                case 10:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                    break;
                case 11:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                    break;
                case 12:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                    break;
                case 13:
                    blackJackCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                    break;
                default:
                    break;
            }
            blackJackCard4.setVisible(true);
            cards[4]=blackJackCardNum4;
            if(blackJackHandCalc()== 2){
                blackJackEndGame();
            }
        }
        else if(whichPlayerCard==5){
            while(true){
                int same = 0;
                blackJackCardNum5 = rand.nextInt(13)+1;
                for (int i = 0; i < 6; i++) {
                    if(cards[i] == blackJackCardNum5){
                        same++;
                    }
                }
                if(same!=4){
                    break;
                }
            }
            switch (blackJackCardNum5) {
                case 1:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                    break;
                case 2:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                    break;
                case 3:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                    break;
               case 4:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                    break;
                case 5:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                    break;
                case 6:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                    break;
               case 7:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                    break;
                case 8:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                    break;
                case 9:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                    break;
                case 10:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                    break;
                case 11:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                    break;
                case 12:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                    break;
                case 13:
                    blackJackCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                    break;
                default:
                    break;
            }
            blackJackCard5.setVisible(true);
            cards[5]=blackJackCardNum5;
            if(blackJackHandCalc()== 2){
                blackJackEndGame();
            }
        }
        else if(whichPlayerCard==6){
            while(true){
                int same = 0;
                blackJackCardNum6 = rand.nextInt(13)+1;
                for (int i = 0; i < 7; i++) {
                    if(cards[i] == blackJackCardNum6){
                        same++;
                    }
                }
                if(same!=4){
                    break;
                }
            }
            switch (blackJackCardNum6) {
                case 1:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                    break;
                case 2:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                    break;
                case 3:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                    break;
               case 4:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                    break;
                case 5:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                    break;
                case 6:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                    break;
               case 7:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                    break;
                case 8:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                    break;
                case 9:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                    break;
                case 10:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                    break;
                case 11:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                    break;
                case 12:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                    break;
                case 13:
                    blackJackCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                    break;
                default:
                    break;
            }
            blackJackCard6.setVisible(true);
            cards[6]=blackJackCardNum6;
            if(blackJackHandCalc()== 2){
                blackJackEndGame();
            }
        }
        else if(whichPlayerCard==7){
            while(true){
                int same = 0;
                blackJackCardNum7 = rand.nextInt(13)+1;
                for (int i = 0; i < 8; i++) {
                    if(cards[i] == blackJackCardNum7){
                        same++;
                    }
                }
                if(same!=4){
                    break;
                }
            }
            switch (blackJackCardNum7) {
                case 1:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                    break;
                case 2:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                    break;
                case 3:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                    break;
               case 4:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                    break;
                case 5:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                    break;
                case 6:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                    break;
               case 7:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                    break;
                case 8:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                    break;
                case 9:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                    break;
                case 10:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                    break;
                case 11:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                    break;
                case 12:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                    break;
                case 13:
                    blackJackCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                    break;
                default:
                    break;
            }
            blackJackCard7.setVisible(true);
            cards[7]=blackJackCardNum7;
            if(blackJackHandCalc()== 2){
                blackJackEndGame();
            }
        }
        else if(whichPlayerCard==8){
            while(true){
                int same = 0;
                blackJackCardNum8 = rand.nextInt(13)+1;
                for (int i = 0; i < 9; i++) {
                    if(cards[i] == blackJackCardNum8){
                        same++;
                    }
                }
                if(same!=4){
                    break;
                }
            }
            switch (blackJackCardNum8) {
                case 1:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                    break;
                case 2:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                    break;
                case 3:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                    break;
               case 4:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                    break;
                case 5:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                    break;
                case 6:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                    break;
               case 7:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                    break;
                case 8:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                    break;
                case 9:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                    break;
                case 10:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                    break;
                case 11:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                    break;
                case 12:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                    break;
                case 13:
                    blackJackCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                    break;
                default:
                    break;
            }
            blackJackCard8.setVisible(true);
            cards[8]=blackJackCardNum8;
            if(blackJackHandCalc()== 2){
                blackJackEndGame();
            }
        }
        else if(whichPlayerCard==9){
            while(true){
                int same = 0;
                blackJackCardNum9 = rand.nextInt(13)+1;
                for (int i = 0; i < 10; i++) {
                    if(cards[i] == blackJackCardNum9){
                        same++;
                    }
                }
                if(same!=4){
                    break;
                }
            }
            switch (blackJackCardNum9) {
                case 1:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                    break;
                case 2:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                    break;
                case 3:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                    break;
               case 4:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                    break;
                case 5:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                    break;
                case 6:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                    break;
               case 7:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                    break;
                case 8:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                    break;
                case 9:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                    break;
                case 10:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                    break;
                case 11:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                    break;
                case 12:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                    break;
                case 13:
                    blackJackCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                    break;
                default:
                    break;
            }
            blackJackCard9.setVisible(true);
            cards[9]=blackJackCardNum9;
            if(blackJackHandCalc()== 2){
                blackJackEndGame();
            }
            else if(whichPlayerCard==10){
            while(true){
                int same = 0;
                blackJackCardNum10 = rand.nextInt(13)+1;
                for (int i = 0; i < 11; i++) {
                    if(cards[i] == blackJackCardNum10){
                        same++;
                    }
                }
                if(same!=4){
                    break;
                }
            }
            switch (blackJackCardNum10) {
                case 1:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/AC.png")));
                    break;
                case 2:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/2C.png")));
                    break;
                case 3:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/3C.png")));
                    break;
               case 4:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/4C.png")));
                    break;
                case 5:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/5C.png")));
                    break;
                case 6:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/6C.png")));
                    break;
               case 7:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/7C.png")));
                    break;
                case 8:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/8C.png")));
                    break;
                case 9:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/9C.png")));
                    break;
                case 10:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/10C.png")));
                    break;
                case 11:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/JC.png")));
                    break;
                case 12:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/QC.png")));
                    break;
                case 13:
                    blackJackCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinoGame/KC.png")));
                    break;
                default:
                    break;
            }
            blackJackCard10.setVisible(true);
            cards[10]=blackJackCardNum10;
            if(blackJackHandCalc()== 2){
                blackJackEndGame();
            }
        }
    }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        blackJackEndGame();  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        blackJackGame.setVisible(false); 
        jPanel3.setVisible(false);
        resetMainMenu();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        resetBlackJack();
        blackJackStartGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        fileHandling.writeFile(usersList);
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed
    
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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField HOLBetAmountField;
    private javax.swing.JInternalFrame HOLBetAmountFrame;
    private javax.swing.JLabel HOLBetLabel;
    private javax.swing.JButton HOLConfirmBetButton;
    private javax.swing.JLabel HOLEndChips;
    private javax.swing.JInternalFrame HOLinsufficientFundsError;
    private javax.swing.JLabel WLDLabel;
    private javax.swing.JLabel WLDLabelBlackJack;
    private javax.swing.JFormattedTextField blackJackBetAmountField;
    private javax.swing.JInternalFrame blackJackBetAmountFrame;
    private javax.swing.JLabel blackJackBetLabel;
    private javax.swing.JLabel blackJackCard1;
    private javax.swing.JLabel blackJackCard10;
    private javax.swing.JLabel blackJackCard2;
    private javax.swing.JLabel blackJackCard3;
    private javax.swing.JLabel blackJackCard4;
    private javax.swing.JLabel blackJackCard5;
    private javax.swing.JLabel blackJackCard6;
    private javax.swing.JLabel blackJackCard7;
    private javax.swing.JLabel blackJackCard8;
    private javax.swing.JLabel blackJackCard9;
    private javax.swing.JButton blackJackConfirmBetButton;
    private javax.swing.JLabel blackJackEndChips;
    private javax.swing.JLayeredPane blackJackGame;
    private javax.swing.JInternalFrame blackJackinsufficientFundsError;
    private javax.swing.JLabel cardImage1;
    private javax.swing.JLabel cardImage2;
    private javax.swing.JLabel dealerCard1;
    private javax.swing.JLabel dealerCard2;
    private javax.swing.JLayeredPane highOrLowerGame;
    private javax.swing.JButton higherButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JLayeredPane loginMenu;
    private javax.swing.JButton lowerButton;
    private javax.swing.JLayeredPane mainMenu;
    public static javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel usedUsernameError;
    private javax.swing.JLabel userOrPassError;
    public static javax.swing.JFormattedTextField usernameField;
    private javax.swing.JLabel walletText;
    // End of variables declaration//GEN-END:variables
}
