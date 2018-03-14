package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Instructions
     */
    public static View get_Instructions(Solo solo) {
        String ref = "Instructions";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Poop_Sample
     */
    public static View get_PoopSample(Solo solo) {
        String ref = "Poop_Sample";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Instructions/Instructions
     */
    public static View get_Instructions_Instructions(Solo solo) {
        String ref = "Instructions/Instructions";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/Group_List
     */
    public static View get_Login_GroupList(Solo solo) {
        String ref = "Login/Group_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Poop_Sample/Poop_Sample
     */
    public static View get_PoopSample_PoopSample(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Instructions/Instructions/Scoop_a_Poop
     */
    public static View get_Instructions_Instructions_ScoopaPoop(Solo solo) {
        String ref = "Instructions/Instructions/Scoop_a_Poop";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Group_List/School_Login
     */
    public static View get_Login_GroupList_SchoolLogin(Solo solo) {
        String ref = "Login/Group_List/School_Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Poop_Sample/Poop_Sample/Scan_Barcode
     */
    public static View get_PoopSample_PoopSample_ScanBarcode(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Scan_Barcode";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Poop_Sample/Poop_Sample/Take_From_GPS_1
     */
    public static View get_PoopSample_PoopSample_TakeFromGPS1(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Poop_Sample/Poop_Sample/Take_Photo_Button_1
     */
    public static View get_PoopSample_PoopSample_TakePhotoButton1(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Take_Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Poop_Sample/Poop_Sample/Take_Photo
     */
    public static View get_PoopSample_PoopSample_TakePhoto(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Take_Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Login/Group_List/Groups
     */
    public static View get_Login_GroupList_Groups(Solo solo) {
        String ref = "Login/Group_List/Groups";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Poop_Sample/Poop_Sample/Accuracy
     */
    public static View get_PoopSample_PoopSample_Accuracy(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Poop_Sample/Poop_Sample/Easting
     */
    public static View get_PoopSample_PoopSample_Easting(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Poop_Sample/Poop_Sample/Latitude
     */
    public static View get_PoopSample_PoopSample_Latitude(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Poop_Sample/Poop_Sample/Longitude
     */
    public static View get_PoopSample_PoopSample_Longitude(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Poop_Sample/Poop_Sample/Northing
     */
    public static View get_PoopSample_PoopSample_Northing(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Poop_Sample/Poop_Sample/Postcode
     */
    public static EditText get_PoopSample_PoopSample_Postcode(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Postcode";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Poop_Sample/Poop_Sample/Scanned_Barcode
     */
    public static View get_PoopSample_PoopSample_ScannedBarcode(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Scanned_Barcode";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Poop_Sample/Poop_Sample/Street_Name
     */
    public static EditText get_PoopSample_PoopSample_StreetName(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Street_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Instructions/Instructions/Guide
     */
    public static View get_Instructions_Instructions_Guide(Solo solo) {
        String ref = "Instructions/Instructions/Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Login/Group_List/Guide
     */
    public static View get_Login_GroupList_Guide(Solo solo) {
        String ref = "Login/Group_List/Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Poop_Sample/Poop_Sample/Guide_1
     */
    public static View get_PoopSample_PoopSample_Guide1(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Guide_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Poop_Sample/Poop_Sample/Guide_2
     */
    public static View get_PoopSample_PoopSample_Guide2(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Guide_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Poop_Sample/Poop_Sample/Guide_3
     */
    public static View get_PoopSample_PoopSample_Guide3(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Guide_3";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Poop_Sample/Poop_Sample/Guide_4
     */
    public static View get_PoopSample_PoopSample_Guide4(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Guide_4";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Poop_Sample/Poop_Sample/Guide_5
     */
    public static View get_PoopSample_PoopSample_Guide5(Solo solo) {
        String ref = "Poop_Sample/Poop_Sample/Guide_5";
        return (android.view.View) solo.getView((Object) ref);
    }
}
