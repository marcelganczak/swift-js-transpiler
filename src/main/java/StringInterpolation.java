import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StringInterpolation {

    static public void breakUp(String srcFile) {
        String outFile = "./broke-up-string-interpolation.swift";

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(srcFile));
            bw = new BufferedWriter(new FileWriter(outFile));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(breakUpLine(line) + "\n");
            }
        } catch (Exception e) {
            return;
        } finally {
            try {
                if(br != null)
                    br.close();
            } catch (IOException e) {
                //
            }
            try {
                if(bw != null)
                    bw.close();
            } catch (IOException e) {
                //
            }
        }
    }

    static private String breakUpLine(String line) {
        String newLine = "";
        boolean inString = false;
        int inEscape = -1;
        ArrayList<Integer> numParenthesisForEscape = new ArrayList<Integer>();
        for(int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            String ret = ch + "";
            if(inString) {
                if(ch == '"' && line.charAt(i - 1) != '\\') inString = false;
                else if(ch == '\\' && line.charAt(i + 1) == '(') {inString = false;inEscape++;numParenthesisForEscape.add(0);ret = "\" + ";}
            }
            else {
                if(ch == '"') inString = true;
                else if(inEscape >= 0) {
                    if(ch == '(') numParenthesisForEscape.set(inEscape, numParenthesisForEscape.get(inEscape) + 1);
                    else if(ch == ')') {
                        numParenthesisForEscape.set(inEscape, numParenthesisForEscape.get(inEscape) - 1);
                        if(numParenthesisForEscape.get(inEscape) == 0) {inString = true;inEscape--;numParenthesisForEscape.remove(numParenthesisForEscape.size() - 1);ret = ") + \"";}
                    }
                }
            }
            newLine += ret;
        }
        return newLine;
    }
}
