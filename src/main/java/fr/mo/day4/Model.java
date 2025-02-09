package fr.mo.day4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Model {

    MessageDigest md = MessageDigest.getInstance("MD5");

    public Model() throws NoSuchAlgorithmException {}


}
