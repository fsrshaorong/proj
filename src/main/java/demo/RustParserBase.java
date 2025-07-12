//杨子霄负责
package demo;

import org.antlr.v4.runtime.*;

public abstract class RustParserBase extends Parser {
    public RustParserBase(TokenStream input){
        super(input);
    }

    public boolean next(char expect){
        return _input.LA(1) == expect;
    }
}