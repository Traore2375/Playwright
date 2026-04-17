package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class pageTables {

    private Page page;


    public pageTables(Page page) {
        this.page = page;
    }

    private Locator txtTextTables(){
        return page.getByText("Web Tables");
    }

    private Locator btnAdd(){
        return page.locator("#addNewRecordButton");
    }

    private Locator txtfirstname(){
        return page.locator("#firstName");
    }

    private Locator txtlastname(){
        return page.locator("#lastName");
    }

    private Locator txtuserMail(){
        return page.locator("#userEmail");
    }

    private Locator txtage(){
        return page.locator("#age");
    }


    private Locator txtsalary(){
        return page.locator("#salary");
    }

    private Locator txtdepartement(){
        return page.locator("#department");
    }

    private Locator btnsubmit(){
        return page.locator("#submit");
    }

    // ACTIONS

    public void open(String url){
        page.navigate(url);
    }
    public void filltable(String first, String last, String mail, String age, String sal, String dep ){
       btnAdd().click();
        txtfirstname().fill(first);
        txtlastname().fill(last);
        txtuserMail().fill(mail);
        txtage().fill(age);
        txtsalary().fill(sal);
        txtdepartement().fill(dep);

    }

    public void submit(){
        btnsubmit().click();
    }
}
