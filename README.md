# Clicker
This time I made a simple `clicker`. There are 3 buttons in this program - add 1 click, 10 or 100. I finally started using Java to handle events

 ## Compatibility
 
This is already standard, the program is made on `AndroidStudio` and it is not compatible with Apple

<h1 align="center">
 
| <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/800px-Android_robot.svg.png_48x48.png" alt="Edge" width="45px" height="50px" /></br>Android | <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Apple_logo_grey.svg/1724px-Apple_logo_grey.svg.png" alt="Edge" width="45px" height="50px" /></br>Apple |
:-------:|:-------:|
|    ✔️  |    ❌  |

</h1> 

![Gif](gif.gif) 


<h1 align="center">Important code moments</h1> 

This time there is `Java` in the code. In Java, I have 3 functions: OnClick 1, OnClick 2 and OnClick 3, each of these functions adds clicks, just in different amounts
### Example

```
public void OnClick1(View v) {
        click ++;
        textView.setText("Clicks: " + click);
    }
```
All other functions work according to the same principle

I also used `Margin` in XML design. These are indents from buttons and text

```
android:layout_marginTop="20pt"
android:layout_marginBottom="5pt"
```
I also used a RelativeLayout inside another RelativeLayout instead of one LinearLayout to place the buttons horizontally
```
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    ...
    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/button1"
        android:layout_centerHorizontal="true">
    ...
    </RelativeLayout>
</RelativeLayout>

```

<div align="center">

# Image

 ![Screenshot](Screenshot.png) 
