package com.example.midqsolveray;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private TextField showinfoTF;
    @FXML
    private ComboBox<String >courseCB;
    @FXML
    private RadioButton labRB;
    @FXML
    private CheckBox scholarshipCheckBOx;
    @FXML
    private TextField scholarshipTF;
    @FXML
    private TextField idTF;
    @FXML
    private TextField creditTF;
    @FXML
    private RadioButton theoryRB;
    @FXML
    private ComboBox<Integer> sectionCB;
    @FXML
    private ComboBox<Integer> filtersectionCB;

    ToggleGroup tg = new ToggleGroup();
    ArrayList<Course> courseArrayList = new ArrayList<>();
    ArrayList<RegisteredCourse>registeredCourses = new ArrayList<>();
    Student tempStud;
    @FXML
    public void initialize() {
        courseArrayList.add(new Course("Cse101",1));
        courseArrayList.add(new Course("CSe101L",2));
        courseArrayList.add(new Course("CSe 211",1));
        courseArrayList.add(new Course("CSe211L",2));
        courseArrayList.add(new Course("MAT203",1));
        courseArrayList.add(new Course("PHY101L",2));
        courseArrayList.add(new Course("PHY101",1));
        courseArrayList.add(new Course("PHY102",1));
        courseArrayList.add(new Course("PHY102L",2));
        courseArrayList.add(new Course("MAT104",2));

       // courseCB.getItems().addAll();

        for (Course c : courseArrayList) {
            courseCB.getItems().add(c.getCourseID());
        }
        for( int i=1;i<31;i++){
            sectionCB.getItems().add(i);
            filtersectionCB.getItems().add(i);
        }
        theoryRB.setToggleGroup(tg);
        labRB.setToggleGroup(tg);

    }




    @FXML
    public void showtoatalNoOfCourseButtonOnClick(ActionEvent actionEvent) {
    }

    @FXML
    public void proceedToRegisterAndShowRegInfoButtonOnClick(ActionEvent actionEvent) {
        int studentId; int totalcredit=0;
        int scholarship=0;
        boolean hasScholarship;

        studentId = Integer.parseInt(idTF.getText());
        if (scholarshipCheckBOx.isSelected()) {
            hasScholarship = true;
            if(scholarshipTF.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Scholarship Error");
                alert.setTitle(" If 'HasScholarship'checkbos is checked there must be number how much");
                alert.showAndWait();
            }

        }
        else {
            hasScholarship = false;
            scholarship=0;


        }

        tempStud =new Student(studentId,scholarship,hasScholarship);//student Initialization

        String output= "";
        output +="student ID: "+tempStud.getStudentID()+ "scholarship: "+tempStud.isHasScholarship()+";"+tempStud.getScholarshipRate()+"%,Tution fee per credit:6000\n";
        output +="registered Course: \n";

        for (RegisteredCourse registeredcourse:registeredCourses ) {
            output +=registeredcourse.toString();
            totalcredit +=registeredcourse.getCourseCredit();
        }
        int totalAmount = (totalcredit*6000);
        int scholarshipAmount = totalAmount*tempStud.getScholarshipRate()/100;
        int payable = totalAmount-scholarshipAmount;

        output = "total credit: "+totalcredit + " Total payable amount: "+ payable + "tk\n";
        showinfoTF.setText(output);
    }

    @FXML
    public void addARegisteredCourseButtonOnClick(ActionEvent actionEvent) {

        String courseID;
        int credit,section;
        courseID = courseCB.getValue();
        credit= Integer.parseInt(creditTF.getText());
        section = (int) sectionCB.getValue();
        registeredCourses.add(new RegisteredCourse(courseID,credit,section));

    }
}