package com.ywgroup.iecloud.test;
/**
 * @program: solarpower
 * @description:
 * @author: wxhai
 * @create: 2019-03-06 14:47
 **/
public class Test {


    public static void main(String[] args) {
        logout();
    }


    public static void logout(){
        boolean var13 = false;
        label142: {
            try {
                var13 = true;
                System.out.println("this.delete(subject);");
                var13 = false;
                break label142;
            } catch (Exception var17) {
                var13 = false;
            } finally {
                if (var13) {
                    try {
                        System.out.println("this.stopSession(subject);");
                    } catch (Exception var14) {

                    }

                }
                System.out.println("finally running ");
            }
            try {
                System.out.println("this.stopSession(subject);");
            } catch (Exception var15) {
                return;
            }
            return;
        }

//        System.out.println("logout method return .....");
    }


}

