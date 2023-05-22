package OODJ_Assignment;

public class Main {
    public static String ID;
    public static String Name;

    private static MainMenu main;
    private static Customer_Login custLogin;
    private static Admin_Login adLogin;
    private static SuperAdmin_Login suAdLogin;
//    private static AdminAccount_Creation createAdmin = new AdminAccount_Creation();
    private static Admin_Menu admin;
    private static Customer_Menu cust;
    private static Customer_SignUp signUp;
    private static Feedback_Form feedback;
    private static SuperAdmin_Menu suAd;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        main = new MainMenu();
        main.setVisible(true);
    }
    public void showMain() {
        main.setVisible(true);
    }
    public void setName(String Name) {
        Main.Name = Name;
    }
    public String getName() {
        return Name;
    }
    public void setID(String id){
        ID = id;
    }
    public String getID() {
        return ID;
    }
    public void showCustomerLogin(){
        custLogin  = new Customer_Login();
        custLogin.setVisible(true);
    }
    public void showAdminLogin(){
        adLogin  = new Admin_Login();
        adLogin.setVisible(true);
    }
    public void showSuAdminLogin(){
        suAdLogin  = new SuperAdmin_Login();
        suAdLogin.setVisible(true);
    }
    public void showCustomer(){
        cust  = new Customer_Menu();
        cust.setVisible(true);
    }
    public void showAdmin(){
        admin  = new Admin_Menu();
        admin.setVisible(true);
    }
    public void showSuAdmin(){
        suAd = new SuperAdmin_Menu();
        suAd.setVisible(true);
    }
    public void showFeedback(){
        feedback = new Feedback_Form();
        feedback.setVisible(true);
    }
    public void showSignUp(){
        signUp  = new Customer_SignUp();
        signUp.setVisible(true);
    }
    
}
