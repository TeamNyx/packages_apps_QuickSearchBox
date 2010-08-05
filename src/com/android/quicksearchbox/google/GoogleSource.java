/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.quicksearchbox.google;

import com.android.quicksearchbox.Source;
import com.android.quicksearchbox.SourceResult;
import com.android.quicksearchbox.SuggestionCursor;

/**
 * Special source interface for Google suggestions.
 */
public interface GoogleSource extends Source {

    Source getWebSuggestOnlySource();

    Source getNonWebSuggestSource();

    SuggestionCursor refreshShortcut(String shortcutId, String extraData);

    /**
     * Called by QSB to get web suggestions for a query.
     */
    SourceResult queryInternal(String query);

    /**
     * Called by external apps to get web suggestions for a query.
     */
    SourceResult queryExternal(String query);

}