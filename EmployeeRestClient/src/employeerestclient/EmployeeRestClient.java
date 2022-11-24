/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerestclient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import util.NewJerseyClient;

/**
 *
 * @author SK
 */
public class EmployeeRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        NewJerseyClient njs = new NewJerseyClient();
        String jsn = njs.findAll_JSON(String.class);
        System.out.println(jsn);
        jsn = jsn.substring(2, jsn.length()-2);
        String[] jsnsp = jsn.split(",");
        System.out.println(jsnsp.length);
        String[] jsnsw;
        for(String str:jsnsp){
            System.out.print(str+"\t\t\t\t\t");
            jsnsw = str.split(":", 2);
            switch(jsnsw[0]){
                case "\"year\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"weeknum\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"new_case\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"total_case\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"new_case_excludeabroad\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"total_case_excludeabroad\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"new_recovered\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"total_recovered\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"new_death\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"total_death\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"case_foreign\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"case_prison\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"case_walkin\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"case_new_prev\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"case_new_diff\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"death_new_prev\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"death_new_diff\"":
                    System.out.println(Integer.parseInt(jsnsw[1]));
                break;
                case "\"update_date\"":
                    jsnsw[1] = jsnsw[1].substring(1, jsnsw[1].length()-1);
                    System.out.println(jsnsw[1]);
                    String[] temp = jsnsw[1].split(" ");
                    System.out.println(temp[0]);
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(jsnsw[1]));
                    //cv.setUpdateTime(new SimpleDateFormat("hh:mm:ss").parse(temp.[1]));
                break;
                default:
                    System.out.println("error on "+str);
                break;
            }            
        }
    }
    
}
