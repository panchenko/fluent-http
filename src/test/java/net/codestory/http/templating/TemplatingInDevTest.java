/**
 * Copyright (C) 2013-2015 all@code-story.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package net.codestory.http.templating;

import static net.codestory.http.Configuration.*;

import net.codestory.http.testhelpers.*;

import org.junit.*;

public class TemplatingInDevTest extends AbstractDevWebServerTest {
  @Test
  public void google_analytics_in_dev_mode() {
    configure(NO_ROUTE);

    get("/indexGoogleAnalytics.html").should().contain("<body>\n</body>\n\n</html>");
  }
}
