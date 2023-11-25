# Clicker
This time I made a simple `clicker`. There are 3 buttons in this program - add 1 click, 10 or 100. I finally started using Java to handle events

 ## Compatibility
 
This is already standard, the program is made on `AndroidStudio` and it is not compatible with Apple


| <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/800px-Android_robot.svg.png_48x48.png" alt="Edge" width="45px" height="50px" /></br>Android | <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Apple_logo_grey.svg/1724px-Apple_logo_grey.svg.png" alt="Edge" width="45px" height="50px" /></br>Apple |
:-------:|:-------:|
|    ✔️  |    ❌  |


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

