/*
 The MIT License

 Copyright (c) 2013 Nitesh Patel http://niteshpatel.github.io/ministocks

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */

package nitezh.ministock.tests.mocks;

import java.util.HashMap;

import nitezh.ministock.Storage;


public class MockStorage implements Storage {

    @Override
    public HashMap<String, ?> getAll() {
        return new HashMap<>();
    }

    @Override
    public int getInt(String widgetSize, int defaultVal) {
        return 0;
    }

    @Override
    public String getString(String key, String defaultVal) {
        return "";
    }

    @Override
    public boolean getBoolean(String large_font, boolean defaultVal) {
        return false;
    }

    @Override
    public Storage putInt(String key, int value) {
        return this;
    }

    @Override
    public Storage putString(String key, String value) {
        return this;
    }

    @Override
    public Storage putBoolean(String key, Boolean value) {
        return this;
    }

    @Override
    public Storage putFloat(String key, Float value) {
        return this;
    }

    @Override
    public Storage putLong(String key, Long value) {
        return this;
    }

    @Override
    public void apply() {
    }
}
