
package login_register;

class User {
    
    private String first_name,last_name,phone,age,address,street,city,pincode,dob,gender,department,designation;
    
    public User(String first_name,String last_name,String phone,String age,String address
            ,String street,String city,String pincode,String dob,String gender
            ,String department,String designation)
    {
       this.first_name = first_name;
       this.last_name = last_name;
       this.phone = phone;
       this.age = age;
       this.address = address;
       this.street = street;
       this.city = city;
       this.pincode = pincode;
       this.dob = dob;
       this.gender = gender;
       this.department = department;
       this.designation = designation;
    }
    
    public String getfname()
    {
      return first_name;  
    }
    
    public String getlname()
    {
      return last_name;  
    }
    
    public String getphone()
    {
      return phone;  
    }
    
    public String getage()
    {
      return age;  
    }
    
    public String getaddress()
    {
      return address;  
    }
    
    public String getstreet()
    {
      return street;  
    }
    
    public String getcity()
    {
      return city;  
    }
    
    public String getpincode()
    {
      return pincode;  
    }
    
    public String getdob()
    {
      return dob;  
    }
    
    public String getgender()
    {
      return gender;  
    }
    
    public String getdepartment()
    {
      return department;  
    }
    
    public String getdesignation()
    {
      return designation;  
    }
    
    
}

