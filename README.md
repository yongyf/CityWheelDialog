# CityWheelDialog
会搜商务网app,中国省市区，wheel选择器。
 ![image](https://github.com/yonzhi/CityWheelDialog/blob/master/screenshots/q.png)
 
#使用：
## Add it in your root build.gradle at the end of repositories:

```
 allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 
 ## Add the dependency
 
 ```
 ?dependencies {
	   compile 'com.github.yongyf:CityWheelDialog:v1.0.7'
	}
 ```
##1.创建对话框

```
//对话框样式 NORMAL:正常显示默认省市区  STANDARD：默认显示全部
//省市区显示加载样式LoadStyle ,ALL(省市区全部显示)，PROVINCE(只显示省)，PROVINCE_CITY（只显示省市）
 MyWheelDialog mDialog=new My MyWheelDialog(context,DialogStyle.NORMAL,LoadStyle.ALL,this);
```
##2.显示对话框：
```
mDialog.show();
 ```
 
##3.点击事件

```
@Override
    public void onOKClick(Address address)     {
              Toast.makeText(this, "::"+address.getProvinceName() + address.getProvinceID(),Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onCancelClick() {
}
?
    
