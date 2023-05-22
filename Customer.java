package OODJ_Assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Customer {
    static Main main = new Main();
    
    public static class info{
        ArrayList<String> name = new ArrayList();
        ArrayList<String> number = new ArrayList();
        ArrayList<String> gender = new ArrayList();
        ArrayList<String> nationality = new ArrayList();
        ArrayList<String> email = new ArrayList();
        ArrayList<String> passport = new ArrayList();
        ArrayList<String> username = new ArrayList();
        ArrayList<String> password = new ArrayList();
    }
    public static class customerFile extends info{
        public void readCustomer(){
            name.clear();
            number.clear();
            gender.clear();
            nationality.clear();
            email.clear();
            passport.clear();
            username.clear();
            password.clear();
            try(BufferedReader file = new BufferedReader(new FileReader("Customer.txt"))){
                String line;
                file.readLine();
                while((line = file.readLine()) != null){
                    String[] commas = line.split(",");
                    name.add(commas[0]);
                    number.add(commas[1]);
                    gender.add(commas[2]);
                    nationality.add(commas[3]);
                    email.add(commas[4]);
                    passport.add(commas[5]);
                    username.add(commas[6]);
                    password.add(commas[7]);
                }

            }
            catch(IOException e){
                System.out.println("Incorrect File");
            }
        }
        
        public void editCustomer(String name,String number,String nationality,String email,String passport,String username,String password){
            readCustomer();
            for (int i=0;i<this.name.size();i++){
                if(this.username.get(i).equals(username)){
                    this.name.set(i, name);
                    this.number.set(i, number);
                    this.nationality.set(i, nationality);
                    this.email.set(i, email);
                    this.passport.set(i, passport);
                    this.username.set(i, username);
                    this.password.set(i, password);
                }
            }
            try(FileWriter fw = new FileWriter("Customer.txt");) {
                fw.write("Name,Phone Number,Gender,Country,Email,Passport,Username,Password\n");
                for (int i=0;i<this.name.size();i++){
                    fw.write(this.name.get(i)+","+this.number.get(i)+","+this.gender.get(i)+","+this.nationality.get(i)+","+this.email.get(i)+","+this.passport.get(i)+","+this.username.get(i)+","+this.password.get(i)+"\n");
                }
                fw.close();
             }
            catch (IOException e) {
                System.out.println("Incorrect File Path");
             }
            try(FileWriter fw = new FileWriter("credentials.txt");) {
                fw.write("1,admin123\n");
                fw.write("732a8,admin123\n");
                fw.write("1dbe4,admin123\n");
                for (int i=0;i<this.passport.size();i++){
                    fw.write(this.username.get(i)+","+this.password.get(i)+"\n");
                }
                fw.close();
             }
            catch (IOException e) {
                System.out.println("Incorrect File Path");
             }
            JOptionPane.showMessageDialog(null,"Success!!");
        }
        
        public void createBooking(String USERNAME,String ID,String CARNAME,String CARMODEL,String DATE,String TOTAL,String PAYMENT,String HOUR){
            try(FileWriter fw = new FileWriter("booking.txt",true);) {
                fw.write(USERNAME+","+ID+","+CARNAME+","+CARMODEL+","+DATE+","+TOTAL+","+PAYMENT+",Unconfirmed,"+HOUR+"\n");
                fw.close();
                JOptionPane.showMessageDialog(null,"**********Reciept**********\nName: "+main.getName()+"\nID: "+USERNAME+"\nPayment Method: "+PAYMENT+"\nTotal: "+TOTAL+"\n*****************************");
             }
            catch (IOException e) {
                System.out.println("Incorrect File Path");
             }
        }
    }
    
    public static class getCustomer extends customerFile{
        public int getCustCount(){
            readCustomer();
            return name.size();
        }
        public ArrayList<String> getCustUser(){
            readCustomer();
            return username;
        }
        public ArrayList<String> getGenders(){
            readCustomer();
            return gender;
        }
        public ArrayList<String> getCustomerInfo(String id){
            readCustomer();
            ArrayList<String> info = new ArrayList();
            for (int i=0;i<name.size();i++){
                if(username.get(i).equals(id)){
                    info.add(name.get(i));
                    main.setName(name.get(i));
                    info.add(number.get(i));
                    info.add(gender.get(i));
                    info.add(nationality.get(i));
                    info.add(email.get(i));
                    info.add(passport.get(i));
                    info.add(username.get(i));
                    info.add(password.get(i));
                }
            }
            return info;
        }
        
        public ArrayList<String> getCustomerInfo(int ind){
            readCustomer();
            ArrayList<String> info = new ArrayList();
            info.add(name.get(ind));
            main.setName(name.get(ind));
            info.add(number.get(ind));
            info.add(gender.get(ind));
            info.add(nationality.get(ind));
            info.add(email.get(ind));
            info.add(passport.get(ind));
            info.add(username.get(ind));
            info.add(password.get(ind));
            return info;
        }
    }
    
}
