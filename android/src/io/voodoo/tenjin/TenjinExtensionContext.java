package io.voodoo.tenjin;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import io.voodoo.tenjin.functions.*;

import java.util.HashMap;
import java.util.Map;

public class TenjinExtensionContext extends FREContext {

    public String token;

    public TenjinExtensionContext() {
        super();
    }

    @Override
    public Map<String, FREFunction> getFunctions() {
        Map<String, FREFunction> functions = new HashMap<>();

        functions.put("tenjin_init", new InitFunction());
        functions.put("tenjin_init_connect", new InitConnectFunction());
        functions.put("tenjin_connect", new ConnectFunction());
        functions.put("tenjin_opt_out", new OptOutFunction());
        functions.put("tenjin_opt_in", new OptInFunction());
        functions.put("tenjin_appActivated", new AppActivatedFunction());
        functions.put("tenjin_sendEvent", new SendEventFunction());
        functions.put("tenjin_sendEventWithValue", new SendEventWithValueFunction());
        functions.put("tenjin_transaction", new TransactionFunction());

        return functions;
    }

    @Override
    public void dispose() {

    }
}
