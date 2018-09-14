package tum.ku;

import tum.ku.Model.Account;


import java.io.*;

/**
 * Created by 708 on 8/31/2018.
 */
public class AccountSimulatorUI {
    public static void main(String[] args) {
        Account myAcc = new Account();


        myAcc.income(100,"Mother give");
        myAcc.expense(200,"buy model");
        myAcc.income(500,"Father give");


        System.out.println(myAcc.getBalanceAndHistoty());
        final String FILENAME = "temp.txt";
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
                String content = myAcc.getBalanceAndHistoty();
                fw = new FileWriter(FILENAME,true);
                bw = new BufferedWriter(fw);
                bw.write(content);
                System.out.println("Done");
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                    if (bw != null)
                        bw.close();
                    if (fw != null)
                        fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }



        //read file
//
//        // The name of the file to open.
//        String fileName = "temp.txt";
//
//        // This will reference one line at a time
//        String line = null;
//
//        try {
//            // FileReader reads text files in the default encoding.
//            FileReader fileReader =
//                    new FileReader(fileName);
//
//            // Always wrap FileReader in BufferedReader.
//            BufferedReader bufferedReader =
//                    new BufferedReader(fileReader);
//
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            // Always close files.
//            bufferedReader.close();
//        }
//        catch(FileNotFoundException ex) {
//            System.out.println(
//                    "Unable to open file '" +
//                            fileName + "'");
//        }
//        catch(IOException ex) {
//            System.out.println(
//                    "Error reading file '"
//                            + fileName + "'");
//        }
    }
}
