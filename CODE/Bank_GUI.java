// importing different pacakages 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import java.util.ArrayList;
import java.lang.Double;
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// implementing ActionListener interface
public class Bank_GUI implements ActionListener 
{
    //Declaring the above variable with specific data type
    ArrayList<Bank_Card>array_list_for_bank = new ArrayList<>();
    private JFrame myFrame;
    private JPanel panelBank,panelDebit,panelWithdraw,panelCredit,panelCreditLimit,panelCancelCredit,panelFirstPage,panelMenu,panelCardID,panelCardID1;
    private JTextField textCardID,textIssuerBank,textBalanceAmount,textBankAccount,textClientName,textPinNumber2,textWithdrawalAmount,textCVCNumber,textCreditLimit,textIntrestRate,textGracePeriod,textPin1,textPin2,textPin3,textPin4,
    textCardID1,textCardID2,textCardID3;
    private JButton buttonRegister,buttonReturn7,button,buttonClear1,buttonAddDebit,buttonReturn0 ,buttonPressMe1,buttonPressMe2,buttonPressMe3,buttonPressMe4,buttonReset,buttomSubmit1,buttomReturn1,buttonValue500,buttonValue1000,buttonValue5000,buttonValue10000,buttonReset2,buttonWithdraw,buttonCancel,buttonClear2,buttonSubmit2,buttonReturn2,buttonClear3,buttonSubmit3,buttonReturn3,buttonSubmit4,buttonReturn4,buttonSubmit5,buttonReturn5,buttonSubmit6,buttonReturn6,buttonDis1,buttonDis2;
    private JLabel label,label0,label1,label2,label3,labelCardId,labelIssuerBank,labelBalanceAmount,labelBankAccount,labelClientName,labelPinNumber2,labelWithdrawalAmount,labelCVCNumber,labelCreditLimit,labelInterestRate,labelGracePeriod,labelPinTitle1,labelPinTitle2,labelWithdrawTitle1,labelWithdrawTitle2,labelWithdrawTitle3,labelDateOfWithdrawal,labelExpirationDate,labelMenu1,labelMenu2,labelMenu3,labelMenu4,labelCard1,labelCard2,labelCard3,labelCard4,labelCard5,labelCard6,labelWelcome,labelWelcome1,labelWelcome2,labelMenu;
    private JComboBox <String>comboBoxWithdrawalDate1,comboBoxWithdrawalDate2,comboBoxWithdrawalDate3,comboBoxExpirationDate1,comboBoxExpirationDate2,comboBoxExpirationDate3; 
    public Bank_GUI(){              // constructor with the access modifier public   
        
        myFrame = new JFrame("Nepal rastriya bank");  // creating a object for JFrame                     
        
        panelBank = new JPanel();                   // creating a object for JPanel 
        panelBank.setBackground(Color.LIGHT_GRAY);
        
        panelCardID1 = new JPanel();
        panelCardID1.setBackground(Color.LIGHT_GRAY);
        
        panelCardID = new JPanel();
        panelCardID.setBackground(Color.LIGHT_GRAY);
        
        panelMenu = new JPanel();
        panelMenu.setBackground(Color.LIGHT_GRAY);
        
        panelFirstPage = new JPanel();
        panelFirstPage.setBackground(Color.LIGHT_GRAY);

        panelDebit = new JPanel();
        panelDebit.setBackground(Color.LIGHT_GRAY);
        
        panelWithdraw = new JPanel();
        panelWithdraw.setBackground(Color.LIGHT_GRAY);
        
        panelCredit = new JPanel();
        panelCredit.setBackground(Color.LIGHT_GRAY);
        
        panelCreditLimit = new JPanel();
        panelCreditLimit.setBackground(Color.LIGHT_GRAY);

        panelCancelCredit = new JPanel();
        panelCancelCredit.setBackground(Color.LIGHT_GRAY);
        
        // layout set to null
        panelCardID1.setLayout(null);   
        panelCardID.setLayout(null);
        panelMenu.setLayout(null);
        panelFirstPage.setLayout(null);
        panelBank.setLayout(null);
        panelDebit.setLayout(null);
        panelWithdraw.setLayout(null);
        panelCredit.setLayout(null);
        panelCreditLimit.setLayout(null);
        panelCancelCredit.setLayout(null);
        
        // creating a object for JLabel
        label= new JLabel("----------------------------------------------------------");       
        label0= new JLabel("P & B");
        label1= new JLabel("-----------------------------------------------------------");
        label2= new JLabel("THE PERFECT AND BEST BANKING");
        label3= new JLabel("The right way to go");
        
        labelCardId = new JLabel("CARD ID:");
        labelIssuerBank = new JLabel("ISSUER BANK:");
        labelBankAccount = new JLabel("BANK ACCOUNT:");
        labelClientName = new JLabel("CLIENT NAME:");
        labelBalanceAmount = new JLabel("BALANCE AMOUNT:");
        labelPinNumber2 = new JLabel("SET PIN NUMBER:");
        
        labelPinTitle1 = new JLabel("Hello User");
        labelPinTitle2 = new JLabel("Firstly We need you to enter your Pin Number");
        labelWithdrawalAmount = new JLabel("WITHDRAWAL AMOUNT:");
        
        labelWithdrawTitle1 = new JLabel("Press the amount you would like to withdraw");
        labelWithdrawTitle2 = new JLabel("For Customize withdraw");
        labelWithdrawTitle3 = new JLabel("Enter the Amount:");
        
        labelDateOfWithdrawal = new JLabel("Date OF Withdrawal:");
        labelExpirationDate = new JLabel("Expiration Date");
        
        labelCVCNumber = new JLabel("CVCNUMBER");
        labelInterestRate = new JLabel("INTEREST RATE");
        
        labelCreditLimit = new JLabel("CREDIT LIMIT");
        labelGracePeriod = new JLabel("GRACE PERIOD");
        
        labelMenu1 = new JLabel("To Withdraw");
        labelMenu2 = new JLabel("To Add Credit Card");
        labelMenu3 = new JLabel("To set Credit Limit");
        labelMenu4 = new JLabel("To Cancel Credit Card ");
        
        labelCard1 = new JLabel("Enter your CardID");
        labelCard2 = new JLabel("NOTE: If the CardID is not valid you won't be able to withdraw");
        
        labelCard3 = new JLabel("Enter your CardID");
        labelCard4 = new JLabel("NOTE: If the CardID is not valid you won't be able to Set Your Credit Limit");
        
        labelCard5 = new JLabel("Enter your CardID");
        labelCard6 = new JLabel("NOTE: If the CardID is not valid you won't be able to Cancel Credit Card");
        
        labelWelcome = new JLabel("Welcome to P & B Banking");
        labelWelcome1 = new JLabel("Restiger to be our family");
        
        labelMenu = new JLabel("SO, WHAT WOULD YOU LIKE TO DO?");
        
        // creating a object for JTextField
        textCardID = new JTextField();     
        textIssuerBank = new JTextField();
        textBalanceAmount = new JTextField();
        textBankAccount = new JTextField();
        textClientName = new JTextField();
        textPinNumber2 = new JTextField();
        
        textPin1 = new JTextField();
        textPin2 = new JTextField();
        textPin3 = new JTextField();
        textPin4 = new JTextField();
        textWithdrawalAmount = new JTextField();
        
        textCVCNumber = new JTextField();
        textIntrestRate = new JTextField();
        
        textCreditLimit = new JTextField();
        textGracePeriod = new JTextField();
        
        textCardID1 = new JTextField();
        textCardID2 = new JTextField();
        textCardID3 = new JTextField();
        
        // creating a object for JButton
        buttonRegister = new JButton("Register");    
        button = new JButton("Enter");
        buttonClear1 = new JButton("Clear");
        buttonAddDebit = new JButton("Add Debit Card");
        buttonReturn0 = new JButton("Home");
        buttonPressMe1 = new JButton("Press me");
        buttonPressMe2 = new JButton("Press me");
        buttonPressMe3 = new JButton("Press me");
        buttonPressMe4 = new JButton("Press me");
        buttonReset = new JButton("Reset");
        buttomSubmit1 = new JButton("Submit");
        buttomReturn1 = new JButton("Return");
        buttonValue500 = new JButton("500");
        buttonValue1000 = new JButton("1000");
        buttonValue5000 = new JButton("5000");
        buttonValue10000 = new JButton("10000");
        buttonReset2 = new JButton("Rest");
        buttonWithdraw = new JButton("Withdraw");
        buttonCancel = new JButton("cancel");
        buttonClear2 = new JButton("Clear");
        buttonSubmit2 = new JButton("Submit");
        buttonReturn2 = new JButton("Return");
        buttonClear3 = new JButton("Clear");
        buttonSubmit3 = new JButton("Submit");
        buttonReturn3 = new JButton("Return");
        buttonSubmit4 = new JButton("Submit");
        buttonReturn4 = new JButton("Return");
        buttonSubmit5 = new JButton("Submit");
        buttonReturn5 = new JButton("Return");
        buttonSubmit6 = new JButton("Submit");
        buttonReturn6 = new JButton("Return");
        buttonReturn7 = new JButton("Return");
        buttonDis1 = new JButton("Display");
        buttonDis2 = new JButton("Display");
        
        // declearing initializing and constructing an array in the same line
        String[]Year1= {"2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        String[]Year= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        String[]month = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        String[]Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        
         // creating a object for JComboBox
        comboBoxWithdrawalDate1 = new JComboBox<>(Year);  
        comboBoxWithdrawalDate2 = new JComboBox<>(month);
        comboBoxWithdrawalDate3 = new JComboBox<>(Day);
        comboBoxExpirationDate1 = new JComboBox<>(Year1);
        comboBoxExpirationDate2 = new JComboBox<>(month);
        comboBoxExpirationDate3 = new JComboBox<>(Day);
        
        
        // setting bound to set the object in the specified location of the GUI
        textCardID.setBounds(238, 238, 180,32);             
        textIssuerBank.setBounds(238, 293, 180,32);
        textBalanceAmount.setBounds(238,413,180,32);
        textBankAccount.setBounds(238, 353,180,32);
        textClientName.setBounds(238, 183, 180,32);
        textPinNumber2.setBounds(238, 476, 180,32);
        
        textPin1.setBounds(92,139,76,32);
        textPin2.setBounds(230,139,76,32);
        textPin3.setBounds(92,209,76,32);
        textPin4.setBounds(230,205,76,32);
        
        textWithdrawalAmount.setBounds(104,284,180,32);
        
        textCVCNumber.setBounds(36, 173, 180,60);
        textIntrestRate.setBounds(259, 173,180,66);
        
        textCreditLimit.setBounds(11,134,117,38);
        textGracePeriod.setBounds(165,134,117,38);
        
        textCardID1.setBounds(39,124,210,38);
        textCardID2.setBounds(39,124,210,38);
        textCardID3.setBounds(39,124,210,38);
        
        buttonRegister.setBounds(201, 523, 130,32);
        buttonReturn7.setBounds(5, 525, 90,32);
        button.setBounds(135, 404, 120,32);
        buttonClear1.setBounds(10, 595, 120,36);
        buttonAddDebit.setBounds(161,595,211,38);
        buttonReturn0.setBounds(400,595,120,36);
        buttonPressMe1.setBounds(311,183,120,32);
        buttonPressMe2.setBounds(311,290,120,32);
        buttonPressMe3.setBounds(311,382,120,32);
        buttonPressMe4.setBounds(311,484,120,32);
        buttonReset.setBounds(5,365,77,26);
        buttomSubmit1.setBounds(133,271,148,32);
        buttomReturn1.setBounds(370,368,77,26);
        buttonValue500.setBounds(44,69,120,32);
        buttonValue1000.setBounds(230,69,120,32);
        buttonValue5000.setBounds(44,136,120,32);
        buttonValue10000.setBounds(230,131,120,32);
        buttonReset2.setBounds(5,365,77,26);
        buttonWithdraw.setBounds(135,320,124,32);
        buttonCancel.setBounds(370,368,77,26);
        buttonClear2.setBounds(13,385,81,32);
        buttonSubmit2.setBounds(138,350,184,32);
        buttonReturn2.setBounds(384,390,81,32);
        buttonClear3.setBounds(5,266,64,26);
        buttonSubmit3.setBounds(65,192,158,32);
        buttonReturn3.setBounds(210,266,74,26);
        buttonSubmit4.setBounds(84,170,120,32);
        buttonReturn4.setBounds(9,8,98,32);
        buttonSubmit5.setBounds(84,170,120,32);
        buttonReturn5.setBounds(9,8,98,32);
        buttonSubmit6.setBounds(84,170,120,32);
        buttonReturn6.setBounds(9,8,98,32);
        buttonDis1.setBounds(100,220,85,32);
        buttonDis2.setBounds(100,220,85,32);
        
        labelMenu.setBounds(10,50,450,100);
        
        label.setBounds(50, 115, 268,128);
        label0.setBounds(61, 172, 268,128);
        label1.setBounds(55, 221, 268,128);
        label2.setBounds(46, 287, 345,62);
        label3.setBounds(239, 325, 157,38);
        
        labelCardId.setBounds(60, 248, 88,22);
        labelIssuerBank.setBounds(60,300, 130,25);
        labelBankAccount.setBounds(60,362, 150,23);
        labelBalanceAmount.setBounds(60, 413,160,32);
        labelClientName.setBounds(60,190,130,23);
        labelPinNumber2.setBounds(60, 475, 160,32);
        
        labelPinTitle1.setBounds(5,22,120,34);
        labelPinTitle2.setBounds(5,51,439,28);
        labelWithdrawalAmount.setBounds(5,501,177,77);
        
        labelWithdrawTitle1.setBounds(9,16,415,22);
        labelWithdrawTitle2.setBounds(9,230,187,22);
        labelWithdrawTitle3.setBounds(17,254,152,22);
        
        labelDateOfWithdrawal.setBounds(44,190,170,32);
        labelExpirationDate.setBounds(126,266,192,28);
        
        labelCVCNumber.setBounds(52,132, 148,28);
        labelInterestRate.setBounds(272,132, 153,28);
        
        labelCreditLimit.setBounds(11, 86, 118,28);
        labelGracePeriod.setBounds(165, 86, 129,28);
        
        labelMenu1.setBounds(63, 178, 151,42);
        labelMenu2.setBounds(63, 280, 151,42);
        labelMenu3.setBounds(63, 382, 151,42);
        labelMenu4.setBounds(63, 484, 180,42);
        
        labelCard1.setBounds(65, 73, 158,38);
        labelCard2.setBounds(9, 236, 281,38);
        
        labelCard3.setBounds(65, 73, 158,38);
        labelCard4.setBounds(9, 236, 281,38);
        
        labelCard5.setBounds(65, 73, 158,38);
        labelCard6.setBounds(9, 236, 281,38);
        
        labelWelcome.setBounds(80, 30, 420,38);
        labelWelcome1.setBounds(150, 80, 281,38);
        
        
        comboBoxWithdrawalDate1.setBounds(230, 190, 70,32);
        comboBoxWithdrawalDate2.setBounds(300, 190, 80, 32);
        comboBoxWithdrawalDate3.setBounds(380,190, 40, 32);
        
        comboBoxExpirationDate1.setBounds(27,306,134, 32);
        comboBoxExpirationDate2.setBounds(170,306, 134, 32);
        comboBoxExpirationDate3.setBounds(313,306,134, 32);
        
        comboBoxWithdrawalDate1.setFont(new Font("Arial",Font.BOLD,13));   // Setting the font of the specified object
        comboBoxWithdrawalDate2.setFont(new Font("Arial",Font.BOLD,13));
        comboBoxWithdrawalDate3.setFont(new Font("Arial",Font.BOLD,13));
        
        label.setFont(new Font("Arial",Font.BOLD,13));
        label0.setFont(new Font("Arial",Font.BOLD,90));
        label1.setFont(new Font("Arial",Font.BOLD,13));
        label2.setFont(new Font("Arial",Font.BOLD,20));
        label3.setFont(new Font("Arial",Font.BOLD,15));
        
        labelMenu.setFont(new Font("Arial",Font.BOLD,25));
        labelCardId.setFont(new Font("Arial",Font.BOLD,16));
        labelIssuerBank.setFont(new Font("Arial",Font.BOLD,16));
        labelBankAccount.setFont(new Font("Arial",Font.BOLD,16));
        labelBalanceAmount.setFont(new Font("Arial",Font.BOLD,16));
        labelClientName.setFont(new Font("Arial",Font.BOLD,16));
        labelPinNumber2.setFont(new Font("Arial",Font.BOLD,16));
        
        labelPinTitle1.setFont(new Font("Arial",Font.BOLD,24));
        labelPinTitle2.setFont(new Font("Arial",Font.BOLD,20));
        labelWithdrawalAmount.setFont(new Font("Arial",Font.BOLD,13));
        
        
        labelWithdrawTitle1.setFont(new Font("Arial",Font.BOLD,16));
        labelWithdrawTitle2.setFont(new Font("Arial",Font.BOLD,16));
        labelWithdrawTitle3.setFont(new Font("Arial",Font.BOLD,16));
        
        labelDateOfWithdrawal.setFont(new Font("Arial",Font.BOLD,16));
        labelExpirationDate.setFont(new Font("Arial",Font.BOLD,19));
        
        labelCVCNumber.setFont(new Font("Arial",Font.BOLD,20));
        labelInterestRate.setFont(new Font("Arial",Font.BOLD,20));
        
        labelCreditLimit.setFont(new Font("Arial",Font.BOLD,16));
        labelGracePeriod.setFont(new Font("Arial",Font.BOLD,16));
        
        labelMenu1.setFont(new Font("Arial",Font.BOLD,16));
        labelMenu2.setFont(new Font("Arial",Font.BOLD,16));
        labelMenu3.setFont(new Font("Arial",Font.BOLD,16));
        labelMenu4.setFont(new Font("Arial",Font.BOLD,16));
        
        labelCard1.setFont(new Font("Arial",Font.BOLD,18));
        labelCard2.setFont(new Font("Arial",Font.BOLD,9));
        
        labelCard3.setFont(new Font("Arial",Font.BOLD,18));
        labelCard4.setFont(new Font("Arial",Font.BOLD,7));
        
        labelCard5.setFont(new Font("Arial",Font.BOLD,18));
        labelCard6.setFont(new Font("Arial",Font.BOLD,7));
        
        labelWelcome.setFont(new Font("Arial",Font.BOLD,30));
        labelWelcome1.setFont(new Font("Arial",Font.BOLD,20));
        
        // adding specific panel to the myFrame frame 
        myFrame.add(panelCancelCredit);  
        myFrame.add(panelCardID1);
        myFrame.add(panelCardID);
        myFrame.add(panelCreditLimit);
        myFrame.add(panelCancelCredit);
        myFrame.add(panelCredit);
        myFrame.add(panelDebit);
        myFrame.add(panelWithdraw);
        myFrame.add(panelBank);
        myFrame.add(panelFirstPage);
        
        // adding  specific label to the panelBank panel
        panelBank.add(labelCardId);
        panelBank.add(labelIssuerBank);
        panelBank.add(labelBankAccount);
        panelBank.add(labelBalanceAmount);
        panelBank.add(labelClientName);
        panelBank.add(labelPinNumber2);
        
        // adding  specific label to the panelDebit panel
        panelDebit.add(labelPinTitle1);
        panelDebit.add(labelPinTitle2);
        panelWithdraw.add(labelWithdrawTitle1);
        panelWithdraw.add(labelWithdrawTitle2);
        panelWithdraw.add(labelWithdrawTitle3);
        
        // adding  specific label to the panelWithdraw panel
        panelWithdraw.add(labelDateOfWithdrawal);
        panelCredit.add(labelExpirationDate);
        
        // adding  specific label to the panelCredit panel
        panelCredit.add(labelCVCNumber);
        panelCredit.add(labelInterestRate);
        
        // adding  specific label to the panelCreditLimit panel
        panelCreditLimit.add(labelCreditLimit);
        panelCreditLimit.add(labelGracePeriod);
        
        
        // adding  specific label to the panelFirstPage panel
        panelFirstPage.add(label);
        panelFirstPage.add(label0);
        panelFirstPage.add(label1);
        panelFirstPage.add(label2);
        panelFirstPage.add(label3);
        
        
        // adding  specific label to the panelMenu panel
        panelMenu.add(labelMenu);
        panelMenu.add(labelMenu1);
        panelMenu.add(labelMenu2);
        panelMenu.add(labelMenu3);
        panelMenu.add(labelMenu4);
        
        // adding  specific label to the panelCardID panel
        panelCardID.add(labelCard1);
        panelCardID.add(labelCard2);
        
        // adding  specific label to the panelCardID1 panel
        panelCardID1.add(labelCard3);
        panelCardID1.add(labelCard4);
        
        // adding  specific label to the panelCancelCredit panel
        panelCancelCredit.add(labelCard5);
        panelCancelCredit.add(labelCard6);
        
        panelBank.add(labelWelcome);
        panelBank.add(labelWelcome1);
        
        
        // adding  specific TextField to the panelBank panel
        panelBank.add(textCardID);
        panelBank.add(textIssuerBank);
        panelBank.add(textClientName);
        panelBank.add(textBalanceAmount);
        panelBank.add(textBankAccount);
        panelBank.add(textPinNumber2);
        
        // adding  specific TextField to the panelDebit panel
        panelDebit.add(textPin1);
        panelDebit.add(textPin2);
        panelDebit.add(textPin3);
        panelDebit.add(textPin4);
        
        // adding  specific TextField to the panelWithdraw panel
        panelWithdraw.add(textWithdrawalAmount);
        
        // adding  specific TextField to the panelCredit panel
        panelCredit.add(textCVCNumber);
        panelCredit.add(textIntrestRate);
        
        // adding  specific TextField to the panelCreditLimit panel
        panelCreditLimit.add(textCreditLimit);
        panelCreditLimit.add(textGracePeriod);
        
        // adding  specific TextField to the panelCardID panel
        panelCardID.add(textCardID1);
        
        // adding  specific TextField to the panelCardID1 panel
        panelCardID1.add(textCardID2);
        
        // adding  specific TextField to the panelCardID2 panel
        panelCancelCredit.add(textCardID3);
        
        // adding  specific button to the panelMenu panel
        panelMenu.add(buttonReturn7);
        
        panelFirstPage.add(button);
        
        
        // adding  specific button to the panelBank panel
        panelBank.add(buttonClear1);
        panelBank.add(buttonAddDebit);
        panelBank.add(buttonReturn0 );
        panelBank.add(buttonRegister );
        
        // adding  specific button to the panelCardID and panelCardID1 panel
        panelCardID.add(buttonDis1);
        panelCardID1.add(buttonDis2);
        
        // adding  specific button to the panelMenu panel
        panelMenu.add(buttonPressMe1);
        panelMenu.add(buttonPressMe2);
        panelMenu.add(buttonPressMe3);
        panelMenu.add(buttonPressMe4);
        
        
        // adding  specific button to the panelDebit panel
        panelDebit.add(buttonReset);
        panelDebit.add(buttomSubmit1);
        panelDebit.add(buttomReturn1);
    
        // adding  specific button to the panelWithdraw panel
        panelWithdraw.add(buttonValue500);
        panelWithdraw.add(buttonValue1000);
        panelWithdraw.add(buttonValue5000);
        panelWithdraw.add(buttonValue10000);
        panelWithdraw.add(buttonReset2);
        panelWithdraw.add(buttonWithdraw);
        panelWithdraw.add(buttonCancel);
        
        // adding  specific button to the panelCredit panel
        panelCredit.add(buttonClear2);
        panelCredit.add(buttonSubmit2);
        panelCredit.add(buttonReturn2);
        
        
        // adding  specific button to the panelCreditLimit panel
        panelCreditLimit.add(buttonClear3);
        panelCreditLimit.add(buttonSubmit3);
        panelCreditLimit.add(buttonReturn3);
        
        // adding  specific button to the panelCardID and panelCardID1 panel
        panelCardID.add(buttonSubmit4);
        panelCardID.add(buttonReturn4);
        
        panelCardID1.add(buttonSubmit5);
        panelCardID1.add(buttonReturn5);
        
        // adding  specific button to the panelCancelCredit panel
        panelCancelCredit.add(buttonSubmit6);
        panelCancelCredit.add(buttonReturn6);
        
        // adding  specific combobos to the panelWithdraw panel
        panelWithdraw.add(comboBoxWithdrawalDate1);
        panelWithdraw.add(comboBoxWithdrawalDate2);
        panelWithdraw.add(comboBoxWithdrawalDate3);
        
        // adding  specific combobos to the panelCredit panel
        panelCredit.add(comboBoxExpirationDate1);
        panelCredit.add(comboBoxExpirationDate2);
        panelCredit.add(comboBoxExpirationDate3);
        
        //Adding action listener to the all specified buttons
        buttonDis1.addActionListener(this);
        buttonRegister.addActionListener(this);
        buttonReturn7.addActionListener(this);
        button.addActionListener(this);
        buttonClear1.addActionListener(this);
        buttonAddDebit.addActionListener(this);
        buttonReturn0.addActionListener(this);
        
        buttonPressMe1.addActionListener(this);
        buttonPressMe2.addActionListener(this);
        buttonPressMe3.addActionListener(this);
        buttonPressMe4.addActionListener(this);
        
        buttonReset.addActionListener(this);
        buttomSubmit1.addActionListener(this);
        buttomReturn1.addActionListener(this);
        
        buttonValue500.addActionListener(this);
        buttonValue1000.addActionListener(this);
        buttonValue5000.addActionListener(this);
        
        buttonValue10000.addActionListener(this);
        buttonReset2.addActionListener(this);
        buttonWithdraw.addActionListener(this);
        buttonCancel.addActionListener(this);
        buttonClear2.addActionListener(this);
        
        buttonSubmit2.addActionListener(this);
        buttonReturn2.addActionListener(this);
        buttonClear3.addActionListener(this);
        buttonSubmit3.addActionListener(this);
        buttonReturn3.addActionListener(this);
        
        buttonSubmit4.addActionListener(this);
        buttonReturn4.addActionListener(this);
        buttonSubmit5.addActionListener(this);
        buttonReturn5.addActionListener(this);
        
        buttonSubmit6.addActionListener(this);
        buttonReturn6.addActionListener(this);
        
        buttonDis2.addActionListener(this);
    
        
        myFrame.setVisible(true); // visible set tol true
        myFrame.setSize(410,600);   // Setting the size of the frame
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        
    }
    /*
     * a actionPerformed() method is called by the action Listener
     * the actionperformed() method is invoked as the register component is set in the specific button
     */
    public void actionPerformed(ActionEvent action){
        if(action.getSource()==buttonRegister){ // checking if the source of the event is buttonRegister
            if(textCardID.getText().isEmpty() || textIssuerBank.getText().isEmpty() || textBalanceAmount.getText().isEmpty() || textBankAccount.getText().isEmpty() || textClientName.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame,"Please fill up all the required blank spaces","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                try{
                    int cardId = Integer.parseInt(textCardID.getText());
                    int balance_Amount = Integer.parseInt(textBalanceAmount.getText());
                    String issuer_Bank = textIssuerBank.getText();
                    String bank_Account = textBankAccount.getText();
                    String Client_Name = textClientName.getText();
                    for(Bank_Card bankObj :array_list_for_bank){        // using for each loop to loop through the ArrayList bankObj is the variable used to loop through the ArrayList
                        if(bankObj instanceof Bank_Card){              // checking if the bankObj object is instance of Bank_Card class
                            if(cardId == bankObj.getCardId()){          // checking if the entered value of cardID matches with the value of CardID store in the ArrayList
                                JOptionPane.showMessageDialog(myFrame,"Please enter diffrent CARD ID ","Alert",JOptionPane.WARNING_MESSAGE); // displaying dialog box
                                return; //  exiting from the method without adding in the ArrayList
                            }
                        }
                    }
                    Bank_Card objBank = new Bank_Card(balance_Amount,cardId,bank_Account,issuer_Bank); //  creating a object of Bank_Card class
                    array_list_for_bank.add(objBank); //  adding object objBank of BankCard to the ArrayList
                    JOptionPane.showMessageDialog(myFrame,"You've been Registered","Welcome",JOptionPane.INFORMATION_MESSAGE);
                    myFrame.remove(panelBank); // removing the panel from the frame
                    myFrame.add(panelMenu);  //  adding the panel to the frame
                    myFrame.validate(); // to ensure that the object's data is valid before performing any further operations on it.
                    myFrame.repaint(); //  it is used to request that the panelMenu panel be repainted .
                    myFrame.setSize(470,600);
                    myFrame.setLocationRelativeTo(null); //  setting the frame to the center of the screen
                }
                catch(NumberFormatException e){ // catching the speficied exception if occurred
                    JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else if(action.getSource()==buttonReturn0){
            myFrame.remove(panelBank);
            myFrame.add(panelFirstPage);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(410,600); // setting the size of the frame
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==button){
            myFrame.remove(panelFirstPage);
            myFrame.add(panelBank);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(550,678);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonReturn7){
            myFrame.remove(panelMenu);
            myFrame.add(panelBank);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(550,678);
            myFrame.setLocationRelativeTo(null);
        }
        else if (action.getSource()==buttonPressMe1){
            myFrame.remove(panelMenu);
            myFrame.add(panelDebit);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(480,430);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonClear1){
             // the text in the following textField are set to empty string
            textCardID.setText("");
            textIssuerBank.setText("");
            textBalanceAmount.setText("");
            textBankAccount.setText("");
            textClientName.setText("");
            textPinNumber2.setText("");
            JOptionPane.showMessageDialog(myFrame,"Everything Cleared","Work done",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (action.getSource()==buttonAddDebit){
        try{
            if(textPinNumber2.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame,"Pin number needs to be filled","Alert",JOptionPane.WARNING_MESSAGE);
                return;
            }
            int pinNum = Integer.parseInt(textPinNumber2.getText());   // converting the textPinNumber2 to integer and storing in pinNum variable
            if(textCardID.getText().isEmpty() || textIssuerBank.getText().isEmpty() || textBalanceAmount.getText().isEmpty() || textBankAccount.getText().isEmpty() || textClientName.getText().isEmpty()||textPinNumber2.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame,"Please fill up all the required blank spaces","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(pinNum > 9999){ 
                JOptionPane.showMessageDialog(myFrame,"pin number should not be more than 4 digit","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(pinNum <1000){
                JOptionPane.showMessageDialog(myFrame,"pin number should not be less than 4 digit","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    // converting the textField to integer and storing in integer variable
                int cardId = Integer.parseInt(textCardID.getText()); 
                int balance_Amount = Integer.parseInt(textBalanceAmount.getText());
                String issuer_Bank = textIssuerBank.getText();
                String bank_Account = textBankAccount.getText(); //  getText() is used to get the text from thr specifeid textField
                String Client_Name = textClientName.getText();
                int pin_Number = Integer.parseInt(textPinNumber2.getText());
                for(Bank_Card bankObj :array_list_for_bank){     // bankObj is the variable used to loop through the ArrayList
                    if(bankObj instanceof DebitCard){
                        if(cardId == bankObj.getCardId()){
                            JOptionPane.showMessageDialog(myFrame,"Please enter diffrent CARD ID ","Alert",JOptionPane.ERROR_MESSAGE);
                            return; //  exiting from the method without adding in the ArrayList
                        }
                    }
                }
                    Bank_Card objDebit = new DebitCard(balance_Amount,cardId,bank_Account,issuer_Bank,Client_Name,pin_Number); //  creating a object bu perofming downcasting
                    array_list_for_bank.add(objDebit); //  adding object to the array list
                    JOptionPane.showMessageDialog(myFrame,"Your Debit Card has been Added","Congrats",JOptionPane.INFORMATION_MESSAGE);
                    myFrame.remove(panelBank);
                    myFrame.add(panelMenu);
                    myFrame.validate();
                    myFrame.repaint();
                    myFrame.setSize(470,600);
                    myFrame.setLocationRelativeTo(null);
                }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }
        else if(action.getSource()== buttomSubmit1){
            try{
                int pin =  Integer.parseInt(textPin1.getText()+textPin2.getText()+textPin3.getText()+textPin4.getText());
                int setPin = Integer.parseInt(textPinNumber2.getText());
                boolean pinStatus = false;  //  initializing the pinStatus variable to false
                for(Bank_Card bankObj:array_list_for_bank){     // bankObj is the variable used to loop through the ArrayList
                    if(bankObj instanceof DebitCard){
                        if(pin == setPin){
                            myFrame.remove(panelDebit);
                            myFrame.add(panelWithdraw);
                            myFrame.validate();
                            myFrame.repaint();
                            myFrame.setSize(480,430);
                            myFrame.setLocationRelativeTo(null);
                            JOptionPane.showMessageDialog(myFrame,"You're entered in the dimension","Congrats",JOptionPane.INFORMATION_MESSAGE);
                            pinStatus = true;  // setting to true if the condition is satisfied
                            break; // breaking out of the loop
                        }
                    }
                }
                if(pinStatus == false){
                    JOptionPane.showMessageDialog(myFrame,"Wrong pin Number","Try Again",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }
        else if(action.getSource()== buttomReturn1){
                myFrame.remove(panelDebit);
                myFrame.add(panelMenu);
                myFrame.validate();
                myFrame.repaint();
                myFrame.setSize(470,600);
                myFrame.setLocationRelativeTo(null);
            }
        else if (action.getSource()==buttonReset){
                textPin1.setText("");
                textPin2.setText("");
                textPin3.setText("");
                textPin4.setText("");
                JOptionPane.showMessageDialog(myFrame,"Everything Cleared","Work done",JOptionPane.INFORMATION_MESSAGE);
            }
        else if(action.getSource()==buttonReset2){
            textWithdrawalAmount.setText("");
            JOptionPane.showMessageDialog(myFrame,"Everything Cleared","Work done",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(action.getSource()== buttonCancel){
            myFrame.remove(panelWithdraw);
            myFrame.add(panelDebit);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(480,430);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonPressMe2){
            myFrame.remove(panelMenu);
            myFrame.add(panelCredit);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(490,460);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonPressMe3){
            myFrame.remove(panelMenu);
            myFrame.add(panelCreditLimit);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(310,330);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonPressMe4){
            myFrame.remove(panelMenu);
            myFrame.add(panelCancelCredit);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(300,300);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonWithdraw){
            if(textWithdrawalAmount.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame," Please enter the Amount to Withdraw","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                myFrame.remove(panelWithdraw);
                myFrame.add(panelCardID);
                myFrame.validate();
                myFrame.repaint();
                myFrame.setSize(300,300);
                myFrame.setLocationRelativeTo(null);
            }
        }
        else if(action.getSource()==buttonSubmit4){
            try{
                int balanceAmount  = Integer.parseInt(textBalanceAmount.getText());
                int withdrawalAmount = Integer.parseInt(textWithdrawalAmount.getText());
                String text1 = textCardID1.getText();
                boolean cardStatus = false;
                for(Bank_Card bankObj:array_list_for_bank){     // bankObj is the variable used to loop through the ArrayList
                    if(bankObj instanceof DebitCard){
                        if(Integer.parseInt(text1) == bankObj.getCardId()){
                            try{
                                int pin_Number = Integer.parseInt(textPinNumber2.getText());
                                int withdrawal_Amount =Integer.parseInt(textWithdrawalAmount.getText());
                                String date_Of_Withdrawal = comboBoxWithdrawalDate1.getSelectedItem().toString() + comboBoxWithdrawalDate2.getSelectedItem().toString() +comboBoxWithdrawalDate3.getSelectedItem().toString();
                                DebitCard ab1 = (DebitCard)bankObj;   // CAST bankObj to DebitCard object and ASSIGN it to ab1

                                ab1.withdraw(withdrawal_Amount,date_Of_Withdrawal,pin_Number); //CALLING the withdraw() method on ab1 of DebitCard class 
                                if(balanceAmount < withdrawalAmount){
                                    JOptionPane.showMessageDialog(myFrame," Insufficient Balance","Alert",JOptionPane.WARNING_MESSAGE);
                                     cardStatus = true; // setting cardStatus to true
                                    }
                                else{
                                    JOptionPane.showMessageDialog(myFrame,"Your Amount is successfully withdrawn","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                    textPin1.setText("");
                                    textPin2.setText("");
                                    textPin3.setText("");
                                    textPin4.setText("");
                                    textWithdrawalAmount.setText("");
                                    cardStatus = true;
                                    break;
                                }
                            }
                            catch(NumberFormatException e){
                                JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
                if(cardStatus == false){
                    JOptionPane.showMessageDialog(myFrame,"The Card ID does not match,please check","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException e){
        JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
    }
}
        else if(action.getSource()==buttonReturn4){
            myFrame.remove(panelCardID);
            myFrame.add(panelWithdraw);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(480,430);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonClear2){
            textCVCNumber.setText("");
            textIntrestRate.setText("");
            JOptionPane.showMessageDialog(myFrame,"Everything Cleared","Work done",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(action.getSource() == buttonSubmit2){
            if(textCVCNumber.getText().isEmpty() || textIntrestRate.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame,"Please fill up all the required blank spaces","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    int cardId = Integer.parseInt(textCardID.getText());
                    int balance_Amount = Integer.parseInt(textBalanceAmount.getText());
                    String issuer_Bank = textIssuerBank.getText();
                    String bank_Account = textBankAccount.getText();
                    String Client_Name = textClientName.getText();
                    int pin_Number = Integer.parseInt(textPinNumber2.getText());
                    int cvc_Number = Integer.parseInt(textCVCNumber.getText());
                    int interest_Rate = Integer.parseInt(textIntrestRate.getText());
                    String expiration_Date =comboBoxExpirationDate1.getSelectedItem().toString() + comboBoxExpirationDate2.getSelectedItem().toString() +comboBoxExpirationDate3.getSelectedItem().toString();
                    for(Bank_Card bankObj :array_list_for_bank){   // bankObj is the variable used to loop through the ArrayList
                        if(bankObj instanceof CreditCard){
                            if(cardId == bankObj.getCardId()){
                                JOptionPane.showMessageDialog(myFrame,"Please enter diffrent CARD ID ","Alert",JOptionPane.ERROR_MESSAGE);
                                return; //  exiting from the method without adding in the ArrayList
                            }
                        }
                    }
                    Bank_Card objCredit = new CreditCard(balance_Amount,cardId,bank_Account,issuer_Bank,Client_Name,cvc_Number,interest_Rate,expiration_Date);  // downcasting is done
                    array_list_for_bank.add(objCredit); // adding the object to the ArrayList
                    JOptionPane.showMessageDialog(myFrame," Your Credit Card is Added","Congrats",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else if(action.getSource()==buttonReturn2){
            myFrame.remove(panelCredit);
            myFrame.add(panelMenu);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(470,600);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonReturn3){
            myFrame.remove(panelCreditLimit);
            myFrame.add(panelMenu);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(470,600);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource() == buttonClear3){
            textCreditLimit.setText("");
            textGracePeriod.setText("");
            JOptionPane.showMessageDialog(myFrame,"Everything Cleared","Work done",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(action.getSource()==buttonSubmit3){
            if(textCreditLimit.getText().isEmpty()|| textGracePeriod.getText().isEmpty()){
                JOptionPane.showMessageDialog(myFrame,"Please fill up all the required blank spaces","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                myFrame.remove(panelCreditLimit);
                myFrame.add(panelCardID1);
                myFrame.validate();
                myFrame.repaint();
                myFrame.setSize(300,300);
                myFrame.setLocationRelativeTo(null);
            }
        }
        else if(action.getSource()==buttonSubmit5){
            String text3 = textCardID2.getText();
            boolean cardStatus = false; // initializing the cardStatus variable to false
            for(Bank_Card bankObj:array_list_for_bank){ //  
                if(bankObj instanceof CreditCard){
                    if(Integer.parseInt(text3) == bankObj.getCardId()){
                        try{
                            int grace_Period= Integer.parseInt(textGracePeriod.getText());
                            double credit_Limit  = Double.parseDouble(textCreditLimit.getText());
                            CreditCard ab2 = (CreditCard)bankObj;  //cast bankObj to CreditCard object and assign it to ab2

                            ab2.setcredit_Limit_And_grace_Period(credit_Limit,grace_Period);   // CALL the withdraw() method on ab2 of CreditCard class 
                            int balanceAmount  = Integer.parseInt(textBalanceAmount.getText());
                            int CreditLimit = Integer.parseInt(textCreditLimit.getText());
                            if(CreditLimit>=((2.5)*balanceAmount)){
                                JOptionPane.showMessageDialog(myFrame,"Your Credit Limit is low","ALERT",JOptionPane.WARNING_MESSAGE);
                                cardStatus = true;
                            }
                            else{
                            JOptionPane.showMessageDialog(myFrame," Your credit Limit has been set","Congrats",JOptionPane.INFORMATION_MESSAGE);
                            cardStatus = true;
                            break; // breaking from the loop
                        }
                    }
                        catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(myFrame," The value you've entered does not seems valid, please check","Alert",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
            if(cardStatus == false){
                JOptionPane.showMessageDialog(myFrame,"The CardID did not match,please Try again","ALERT",JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(action.getSource()==buttonReturn5){
            myFrame.remove(panelCardID1);
            myFrame.add(panelCreditLimit);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(310,330);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonSubmit6){
            try{
                String text5 = textCardID3.getText();
                boolean cardStatus = false;
                for(Bank_Card bankObj:array_list_for_bank){
                    if(bankObj instanceof CreditCard){
                        if(Integer.parseInt(text5) == bankObj.getCardId()){
                            try{
                                CreditCard ab4 = (CreditCard)bankObj;    //cast bankObj to CreditCard object and assign it to ab4
                                ab4.cancelCreditCard();         // CALL the withdraw() method on ab4 of CreditCard class 
                                JOptionPane.showMessageDialog(myFrame," Your credit  Card has been Cancelled","Congrats",JOptionPane.INFORMATION_MESSAGE);
                                cardStatus = true;
                                break;
                            }
                            catch(NumberFormatException e){
                                JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
                if(cardStatus == false){
                    JOptionPane.showMessageDialog(myFrame,"The CardID did not match,please Try again","ALERT",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(myFrame,"The value inputted doesnot seems valid,please check","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(action.getSource()==buttonReturn6){
            myFrame.remove(panelCancelCredit);
            myFrame.add(panelMenu);
            myFrame.validate();
            myFrame.repaint();
            myFrame.setSize(470,600);
            myFrame.setLocationRelativeTo(null);
        }
        else if(action.getSource()==buttonValue500){
            textWithdrawalAmount.setText("500");
        }
        else if(action.getSource()==buttonValue1000){
            textWithdrawalAmount.setText("1000");
        }
        else if(action.getSource()==buttonValue5000){
            textWithdrawalAmount.setText("5000");
        }
        else if(action.getSource()==buttonValue10000){
            textWithdrawalAmount.setText("10000");
        }
        else if (action.getSource() == buttonDis1) {
    int text7 = Integer.parseInt(textCardID1.getText());
    boolean foundDebit = false;
    for (Bank_Card newObj : array_list_for_bank) {  //newObj is the variable used to loop through the ArrayList
        if (newObj instanceof DebitCard) {
            if (newObj.getCardId() == text7) {
                DebitCard debitObj = (DebitCard) newObj;
                debitObj.display();
                textCardID1.setText("");
                if (debitObj.getHas_Withdrawn() == true) {
                    String details_of_Debitcard = "\n Card ID:" + debitObj.getCardId() + "\n Client Name:" + debitObj.getClientName() + "\n Issuer Bank:" + debitObj.getIssuer_Bank() + "\n Bank Account" + debitObj.getBank_Account() + "\n Balance Amount:" + debitObj.getBalance_Amount() + "\n Pin Number:" + debitObj.getPin_Number() + "\n Withdrawal Amount:" + debitObj.getWithdrawal_Amount() + "\n Date of withdrawal:" + debitObj.getDate_Of_Withdrawal() + "\n Has the user withdrawn:" + debitObj.getHas_Withdrawn();
                    JOptionPane.showMessageDialog(myFrame, details_of_Debitcard, "Your Debit card information is displayed", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String details_of_Debitcard_not = "\n Card ID:" + debitObj.getCardId() + "\n Client Name:" + debitObj.getClientName() + "\n Issuer Bank:" + debitObj.getIssuer_Bank() + "\n Bank Account" + debitObj.getBank_Account() + "\n Balance Amount:" + debitObj.getBalance_Amount();
                    JOptionPane.showMessageDialog(myFrame, details_of_Debitcard_not, "No transaction has been carried out yet.", JOptionPane.INFORMATION_MESSAGE);
                }
                foundDebit = true;
                break;   // breaking from the loop
            }
        }
    }
    if (foundDebit == false) {
        JOptionPane.showMessageDialog(myFrame, "No DebitCard object found with CardID " + text7, "Alert", JOptionPane.WARNING_MESSAGE);
    }
}

        else if(action.getSource() == buttonDis2) {
           int text12 = Integer.parseInt(textCardID2.getText()); 
           boolean foundCredit = false;
           for(Bank_Card bankObj:array_list_for_bank){
                if(bankObj instanceof CreditCard){
                   if(bankObj.getCardId() == text12 ){ 
                   CreditCard creditObj = (CreditCard)bankObj;
                   creditObj.display();
                   textCardID2.setText("");
                   if(creditObj.getis_Granted() == true){
                       String details_of_Creditcard = "\n Card ID:"+creditObj. getCardId()+"\n Client Name:"+ creditObj.getClientName()+"\n Issuer Bank:"+ creditObj.getIssuer_Bank()+"\n Bank Account" + creditObj.getBank_Account()+"\n Balance Amount:"+creditObj.getBalance_Amount()+"\n CVC Number: " +creditObj.getcvc_Number() + "\n Credit Limit:"+ creditObj.getcredit_Limit() + "\n Intrest Rate:"+ creditObj.getinterest_Rate() +"\n Expiration Date:" + creditObj.getexpiration_Date()+"\n Grace Period:" +creditObj.getgrace_Period()+"\nIS granted:"+ creditObj.getis_Granted();
                       JOptionPane.showMessageDialog(myFrame,details_of_Creditcard ,"Your Credit card information is displayed",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        String details_of_Creditcard_not ="\n Card ID:"+creditObj. getCardId()+"\n Client Name:"+ creditObj.getClientName()+"\n Issuer Bank:"+ creditObj.getIssuer_Bank()+"\n Bank Account" + creditObj.getBank_Account()+"\n CVC Number:"+creditObj.getcvc_Number() + "\n Intrest Rate:"+ creditObj.getinterest_Rate() +"\n Expiration Date:" + creditObj.getexpiration_Date();
                         JOptionPane.showMessageDialog(myFrame,details_of_Creditcard_not ,"The credit Limit and grace period are not displayed",JOptionPane.INFORMATION_MESSAGE);
                        }
                    foundCredit = true;
                    break;
                }
            }
        }
        if (foundCredit == false) {
                JOptionPane.showMessageDialog(myFrame, "No DebitCard object found with CardID " + text12, "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }
}
/*
 * The below is the main method it is used to create an object named objBank
 */
    public static void main(String[]args){
        Bank_GUI objbank = new Bank_GUI();
    }
}


