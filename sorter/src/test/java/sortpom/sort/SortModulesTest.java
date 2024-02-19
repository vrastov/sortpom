package sortpom.sort;

import org.junit.jupiter.api.Test;
import sortpom.util.SortPomImplUtil;

class SortModulesTest {
  @Test
  void sortingOfPomFileWithSubmodulesShouldWork() throws Exception {
    SortPomImplUtil.create()
        .sortProperties()
        .sortPlugins("groupId,artifactId")
        .sortModules()
        .sortDependencies("groupId,artifactId")
        .lineSeparator("\n")
        .testFiles("/SortModules_input.xml", "/SortModules_expected.xml");
  }

  @Test
  void sortingOfPomFileWithSubmodulesAndExtraElementsShouldWork() throws Exception {
    SortPomImplUtil.create()
        .customSortOrderFile("sortOrderFiles/extra_dummy_tags.xml")
        .sortProperties()
        .sortPlugins("groupId,artifactId")
        .sortModules()
        .sortDependencies("groupId,artifactId")
        .lineSeparator("\n")
        .testFiles(
            "/SortModules_input_extra_elements.xml", "/SortModules_expected_extra_elements.xml");
  }

  @Test
  void sortingOfPomFileWithSubmodulesNotEnabled() throws Exception {
    SortPomImplUtil.create()
        .sortProperties()
        .sortPlugins("groupId,artifactId")
        .sortDependencies("groupId,artifactId")
        .lineSeparator("\n")
        .testFiles("/SortModules_input.xml", "/SortModules_expected_notsorted.xml");
  }
}
