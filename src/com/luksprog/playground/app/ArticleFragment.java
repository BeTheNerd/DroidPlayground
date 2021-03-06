/** Copyright 2014 Luksprog
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.luksprog.playground.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author Luksprog
 */
public class ArticleFragment extends Fragment {

    private static final String ARTICLE_KEY = "article_key";

    public static ArticleFragment newInstance(int articleIdentif) {
        ArticleFragment af = new ArticleFragment();
        Bundle args = new Bundle();
        args.putInt(ARTICLE_KEY, articleIdentif);
        af.setArguments(args);
        return af;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView txt = new TextView(getActivity());
        txt.setText("This is a very important article which holds the number " + getArguments()
                .getInt(ARTICLE_KEY));
        return txt;
    }
}
