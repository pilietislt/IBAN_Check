package back_end;

import org.iban4j.IbanFormatException;
import org.iban4j.IbanUtil;
import org.iban4j.InvalidCheckDigitException;
import org.iban4j.UnsupportedCountryException;

import java.util.ArrayList;
import java.util.List;

public class Services {


    public static List<String> stringCheck(List<String> list){
        List<String> newList = new ArrayList<>();
        for (String s :
                list) {

            try {
                IbanUtil.validate(s.trim());
                newList.add(s+";true");
            }catch (IbanFormatException |
                    InvalidCheckDigitException |
                    UnsupportedCountryException e){
                newList.add(s+";false");
            }

        }

        return newList;

    }
}
