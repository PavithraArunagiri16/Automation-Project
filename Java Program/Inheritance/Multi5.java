package Inheritance;
class Fifthparent
{
void add() 
{	System.out.println("I am a GrandParent");
}}
class FourthParent extends Fifthparent
{

void add1() 
{	System.out.println("I am a FourthParent");

}}
class ThirdParent extends FourthParent 
{

void add2() 
{	System.out.println("I am a ThirdParent");
}}
class SecondParent extends ThirdParent
{
void add3() 
{	System.out.println("I am a SecondParent");
}}
class FntPrt extends SecondParent
{
static void add4() 
{	System.out.println("I am a FIrstParent");

}}
public class Multi5 extends FntPrt {

	public static void main(String[] args) {
		Multi5 a= new Multi5();
		 a.add();
		a.add1();
		 a.add2();
		 a.add3();
		 add4();
				System.out.println("I am a Child-Main method");
		}}
