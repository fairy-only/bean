package jianmin2;
import java.util.Random;
import java.util.Scanner;
 class Fenshu{
    static int fz1;
    static int fm1;
    static int fz2;
    static int fm2;
    public static void fenshu()//�����������
    {
        Random random=new Random();
         fm1=(random.nextInt(10)+1);
         fz1=(random.nextInt(10)+1);
         fm2=(random.nextInt(10)+1);
         fz2=(random.nextInt(10)+1);
        if(fm1<=fz1||fm2<=fz2)
        {
            fenshu();
        }
    }
    public static char fuhao()    //�����������
    {
    char a=0;
    Random random=new Random();
    int f=random.nextInt(4);
    if(f==0)
          a='+';
    if(f==1)
          a='-';
    if(f==2)
          a='*';
    if(f==3)
          a='/';
    return a;
    }
public static int xunhuan(int m, int n)   // ѭ��ʵ��
      {
        int k,y;
        if(m<n)
        {
          k=m;
          m=n;
          n=k;
        }
        while(m%n!=0)
        {
         y=m%n;
         m=n;
         n=y; 
        }
        return n;
      }
    public static void zhenout()//��������
    {
        fenshu();
        char a1=fuhao();
        if(a1=='+')
        {
            int jieguo1=fm1*fm2;
            int jieguo2=fz1*fm2+fz2*fm1;
            int a=xunhuan(jieguo1,jieguo2);
            System.out.println(fz1+"/"+fm1+"+"+fz2+"/"+fm2+"="+jieguo2/a+"/"+jieguo1/a);    
        }
        if(a1=='-')
        {
            int jieguo1=fm1*fm2;
            int jieguo2=fz1*fm2-fz2*fm1;
            int a=xunhuan(jieguo1,jieguo2);
            System.out.println(fz1+"/"+fm1+"-"+fz2+"/"+fm2+"="+jieguo2/a+"/"+jieguo1/a);    
        }
        if(a1=='*')
        {
            int jieguo1=fm1*fm2;
            int jieguo2=fz1*fz2;
            int a=xunhuan(jieguo1,jieguo2);
            System.out.println(fz1+"/"+fm1+"*"+fz2+"/"+fm2+"="+jieguo2/a+"/"+jieguo1/a);    
        }
        if(a1=='/')
        {
            int jieguo1=fm1*fz2;
            int jieguo2=fz1*fm2;
            int a=xunhuan(jieguo1,jieguo2);
            System.out.println(fz1+"/"+fm1+"/"+fz2+"/"+fm2+"="+jieguo2/a+"/"+jieguo1/a);    
        }
    }    
}
public class size {
     
     static int n;
     static int m;
public static void main(String[] args)
{
    
    Fenshu a=new Fenshu();
    boolean p=true;
    while(p)
    {
    
    Scanner in=new Scanner(System.in);
    System.out.println("1.��ʽ���� 2.���������");
    int ch=in.nextInt();
    if(ch==1)
    {
    System.out.println("��������Ҫȡ����ֵ�ķ�Χ��");
    Scanner in1=new Scanner(System.in);
    n=in1.nextInt();
    m=in1.nextInt();
    System.out.print("��ȷ����Ҫ�������Ŀ���Ƿ�����˳�����1������2��������");
    int c=in.nextInt();
    if(c==1)
    {
    System.out.println("������Ҫ��������������");
    int number=in.nextInt();
    int i=0;
    while(i<number)
    {
      output();      
      i++;
    }    
    }
    if(c==2)
    {
         System.out.println("������Ҫ��������������");
            int number=in.nextInt();
            int i=0;
            while(i<number)
            {
              output1();      
              i++;
            }        
    }
    }
    if(ch==2)
    {
    System.out.println("������Ҫ��������������");
    int number=in.nextInt();
    int i=0;
    while(i<number)
    {
      Fenshu.zhenout();
      i++;
    }
    }
    }
}
public static int shuzi()//����������ֲ����ж���ֵ��Χ
    { 
       
        Random random=new Random();
        int a=(int)(Math.random()*(m-n+1)+n);
        //System.out.print(a);
        return a;
       
    }
public static void fuhao()//�����������
    {
    Random random=new Random();
    int f=random.nextInt(4);
    if(f==0)
        System.out.print('+');
    if(f==1)
        System.out.print('-');
    if(f==2)
        System.out.print('*');
    if(f==3)
        System.out.print('/');
    }

public static void output()//������������˳���
{
    //Scanner in1=new Scanner(System.in);
    
    int a=shuzi();
    int b=shuzi();
    
    Random random=new Random();
    
    int f=random.nextInt(4);  
    if(f==0)
    {
        System.out.print(a);
        System.out.print('+');
        System.out.print(b);
        System.out.println("="+(a+b));
    }
        
    if(f==1)
    {        
        System.out.print(a);
        System.out.print('-');
        System.out.print(b);
        System.out.println("="+(a-b));
        if(a-b<0)
        {           
            System.out.println("�˴μ���ʽʽ�ӽ��Ϊ������");
        }
    }
    if(f==2)
    {
        System.out.print(a);
        System.out.print('*');
        System.out.print(b);
        System.out.println("="+(a*b));
    }
    if(f==3)
    {
        System.out.print(a);
        System.out.print('/');
        System.out.print(b);
        int c=a/b;
        System.out.println("="+c);
        int yushu=a-c*b;
        if(yushu!=0)
        {
            System.out.println("��ʽ�Ӳ�������������Ϊ"+yushu);
        }
        if(yushu==0)
        {
            System.out.println("��ʽ��������");
        }
    } 
    
    
    }
public static void output1()//�������㲻�����˳�
{
    double a=shuzi();
    double b=shuzi();
    
      Random random=new Random();
      int f=random.nextInt(2); 
        if(f==0)
        {
            System.out.print(a);
            System.out.print('+');
            System.out.print(b);
            System.out.println("="+(a+b));
        }
        if(f==1)
        {
            System.out.print(a);
            System.out.print('-');
            System.out.print(b);
            System.out.println("="+(a-b));
            if(a-b<0)
            {           
                System.out.println("�˴μ���ʽʽ�ӽ��Ϊ������");
            }
        } 
}
}