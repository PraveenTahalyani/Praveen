
class Program1{
    String firstName
    String lastName
    String email
    int age

}

Map m1=[firstName: "Praveen" ,lastName:"tahalyani",email:"praveen.tahalyani",age:18]
Map m2=[firstName: "Piku" ,lastName:"kumar",email:"piku.kumar",age:15]
Map m3=[firstName: "ravi" ,lastName:"kumar",email:"ravi.kumar",age:101]
Map m4=[firstName: "anil" ,lastName:"kumar",email:"anil.kumar",age:102]
Map m5=[firstName: "raman" ,lastName:"kumar",email:"ramankumar",age:103]
Map m6=[firstName: "ram" ,lastName:"kumar",email:"ram.kumar",age:104]
Program1 p1=new Program1(m1)
Program1 p2=new Program1(m2)
Program1 p3=new Program1(m3)
Program1 p4=new Program1(m4)
Program1 p5=new Program1(m5)
Program1 p6=new Program1(m6)

List a=[p1,p2,p3,p4,p5,p6]
List b=[]
List c=[]

a.each{
    println "${it.firstName} ${it.lastName} (${it.age})"
}
a.each{ user ->

    if(user.age>20)
            {
              b.push(user)
            }
    else if(user.age<20)
    {
        c.push(user)
    }
}
 b.each{
    println(" hello $it.age")
}
b.each{
    println(it.age)
}
c.each{
    println(it.age)
}