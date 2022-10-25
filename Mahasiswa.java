/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

public class Mahasiswa
{
    public static void Mahasiswa(String[]args){
private:
char nama[20];
char nim[20];
public:
void inputData();
void display();
};
void Mahasiswa::inputData()
{
cout<<"\n-Input Data Mahasiswa-"<<endl;
cout<<"Masukkan Nama Mahasiswa : ";
cin>>nama;
cout<<"Masukkan Nomor Induk Mahasiswa : ";
cin>>nim;
}
void Mahasiswa::display()
{
cout<<"\n-Display Data Mahasiswa-"<<endl;
System.out.print
cout<<"Nama : "<<nama<<endl;
cout<<"NIM : "<<nim<<endl;
};
void main()
{
Mahasiswa mhs;
mhs.inputData();
mhs.display();
getch();
}