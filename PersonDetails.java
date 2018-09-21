/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Date;

/**
 *
 * @author Vaishali Tripathi
 */
public class PersonDetails {
    
    private String Fname;
    private String Lname;
    private String Contact;
    private Date DOB;
    private String date1Str;
    private int Age;
    private String Height;
    private String Weight;
    private String SSN;
    
    private String City;
    private String State;
    private String StreetAdd;
    private String ZipCode;
    
    private String SavingBankName;
    private String SavingBankRouting;
    private String SavingBankAccNum;
    private String SavingBankBalance;
   
    private String CheckingBankName;
    private String CheckingBankRouting;
    private String CheckingBankAccNum;
    private String CheckingBankBalance;
    
    private String LicenseNum;
    private Date LicenseIssueDate;
    private Date LicenseExpiryDate;
    private String IssueDateStr;
    private String ExpiryDateStr;
    private String BloodType;
    private String ImageURL;
    
    private String MedicalRecordNum;
    private String Alergy1;
    private String Alergy2;
    private String Alergy3;

    public PersonDetails(String Fname, String Lname, String Contact, Date DOB, int Age, String Height, String Weight, String SSN, String City, String State, String StreetAdd, String ZipCode, String SavingBankName, String SavingBankRouting, String SavingBankAccNum, String SavingBankBalance, String CheckingBankName, String CheckingBankRouting, String CheckingBankAccNum, String CheckingBankBalance, String LicenseNum, Date LicenseIssueDate, Date LicenseExpiryDate, String BloodType, String MedicalRecordNum, String Alergy1, String Alergy2, String Alergy3) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Contact = Contact;
        this.DOB = DOB;
        this.date1Str = date1Str;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
        this.SSN = SSN;
        this.City = City;
        this.State = State;
        this.StreetAdd = StreetAdd;
        this.ZipCode = ZipCode;
        this.SavingBankName = SavingBankName;
        this.SavingBankRouting = SavingBankRouting;
        this.SavingBankAccNum = SavingBankAccNum;
        this.SavingBankBalance = SavingBankBalance;
        this.CheckingBankName = CheckingBankName;
        this.CheckingBankRouting = CheckingBankRouting;
        this.CheckingBankAccNum = CheckingBankAccNum;
        this.CheckingBankBalance = CheckingBankBalance;
        this.LicenseNum = LicenseNum;
        this.LicenseIssueDate = LicenseIssueDate;
        this.LicenseExpiryDate = LicenseExpiryDate;
        this.BloodType = BloodType;
        this.MedicalRecordNum = MedicalRecordNum;
        this.Alergy1 = Alergy1;
        this.Alergy2 = Alergy2;
        this.Alergy3 = Alergy3;
        this.ImageURL = ImageURL;
        this.IssueDateStr = IssueDateStr;
        this.ExpiryDateStr = ExpiryDateStr;
    }

    public String getIssueDateStr() {
        return IssueDateStr;
    }

    public void setIssueDateStr(String IssueDateStr) {
        this.IssueDateStr = IssueDateStr;
    }

    public String getExpiryDateStr() {
        return ExpiryDateStr;
    }

    public void setExpiryDateStr(String ExpiryDateStr) {
        this.ExpiryDateStr = ExpiryDateStr;
    }

    public String getDate1Str() {
        return date1Str;
    }

    public void setDate1Str(String date1Str) {
        this.date1Str = date1Str;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setState(String State) {
        this.State = State;
    }

    public void setStreetAdd(String StreetAdd) {
        this.StreetAdd = StreetAdd;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public void setSavingBankName(String SavingBankName) {
        this.SavingBankName = SavingBankName;
    }

    public void setSavingBankRouting(String SavingBankRouting) {
        this.SavingBankRouting = SavingBankRouting;
    }

    public void setSavingBankAccNum(String SavingBankAccNum) {
        this.SavingBankAccNum = SavingBankAccNum;
    }

    public void setSavingBankBalance(String SavingBankBalance) {
        this.SavingBankBalance = SavingBankBalance;
    }

    public void setCheckingBankName(String CheckingBankName) {
        this.CheckingBankName = CheckingBankName;
    }

    public void setCheckingBankRouting(String CheckingBankRouting) {
        this.CheckingBankRouting = CheckingBankRouting;
    }

    public void setCheckingBankAccNum(String CheckingBankAccNum) {
        this.CheckingBankAccNum = CheckingBankAccNum;
    }

    public void setCheckingBankBalance(String CheckingBankBalance) {
        this.CheckingBankBalance = CheckingBankBalance;
    }

    public void setLicenseNum(String LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    public void setLicenseIssueDate(Date LicenseIssueDate) {
        this.LicenseIssueDate = LicenseIssueDate;
    }

    public void setLicenseExpiryDate(Date LicenseExpiryDate) {
        this.LicenseExpiryDate = LicenseExpiryDate;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public void setMedicalRecordNum(String MedicalRecordNum) {
        this.MedicalRecordNum = MedicalRecordNum;
    }

    public void setAlergy1(String Alergy1) {
        this.Alergy1 = Alergy1;
    }

    public void setAlergy2(String Alergy2) {
        this.Alergy2 = Alergy2;
    }

    public void setAlergy3(String Alergy3) {
        this.Alergy3 = Alergy3;
    }

    public String getLname() {
        return Lname;
    }

    public String getContact() {
        return Contact;
    }

    public Date getDOB() {
        return DOB;
    }

    public int getAge() {
        return Age;
    }

    public String getHeight() {
        return Height;
    }

    public String getWeight() {
        return Weight;
    }

    public String getSSN() {
        return SSN;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getStreetAdd() {
        return StreetAdd;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public String getSavingBankName() {
        return SavingBankName;
    }

    public String getSavingBankRouting() {
        return SavingBankRouting;
    }

    public String getSavingBankAccNum() {
        return SavingBankAccNum;
    }

    public String getSavingBankBalance() {
        return SavingBankBalance;
    }

    public String getCheckingBankName() {
        return CheckingBankName;
    }

    public String getCheckingBankRouting() {
        return CheckingBankRouting;
    }

    public String getCheckingBankAccNum() {
        return CheckingBankAccNum;
    }

    public String getCheckingBankBalance() {
        return CheckingBankBalance;
    }

    public String getLicenseNum() {
        return LicenseNum;
    }

    public Date getLicenseIssueDate() {
        return LicenseIssueDate;
    }

    public Date getLicenseExpiryDate() {
        return LicenseExpiryDate;
    }

    public String getBloodType() {
        return BloodType;
    }

    public String getMedicalRecordNum() {
        return MedicalRecordNum;
    }

    public String getAlergy1() {
        return Alergy1;
    }

    public String getAlergy2() {
        return Alergy2;
    }

    public String getAlergy3() {
        return Alergy3;
    }

    public PersonDetails() {
    }
    
    
   
}
