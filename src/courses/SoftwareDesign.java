/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

/**
 *  A class to model course SoftwareDesign
 * @author Sivagama Srinivasan
 * August 11th,2020
 */
public class SoftwareDesign extends Courses
{
   public SoftwareDesign()
    {
        super();
        super.listOfCourse("softwaredesign");
    }
    public void certificate(String name)
    {
       super.collegeName = name;
        //do some labelling here, code not implemented yet
        //not necessary for the review
    }
      
}
