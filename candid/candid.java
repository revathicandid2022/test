class candid
{
public static void main(String[] args)
{
Std s1=new Std();
Std s2=new Std();
Std s3=new Std();

s1.setData("roja",20,123456l);
s2.setData("nila",22,234567l);

/*s1.name="roja";
s1.age=22;
s1.phone=123456l;

s2.name="nila";
s2.age=22;
s2.phone=123456l;

System.out.println(s1.name);
System.out.println(s1.age);
System.out.println(s1.phone);

System.out.println(s2.name);
System.out.println(s2.age);
System.out.println(s2.phone);*/


s1.display();
s2.display();

}
}