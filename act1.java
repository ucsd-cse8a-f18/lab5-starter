String path = "data/cities.csv"
int latColIndex = 3
int longColIndex = 4

String commafy(String s)
{
  return concat(concat(",", s),",");
}

int numColumns(String header) {
  return count(header, ",") + 1;
}

String dataAtColumn(String row , int col) {
  return substring(row, indexOfNth(row, ",", col - 1) + 1, indexOfNth(row, ",", col));
}

int intAtColumn(String row, int col) {
  return parseInt(substring(substring(row, indexOfNth(row, ",", col - 1) + 1, indexOfNth(row, ",", col)), 0, indexOf(substring(row, indexOfNth(row, ",", col - 1) + 1, indexOfNth(row,",",col)),".")));
}

double doubleAtColumn(String row, int col) {
  return parseDouble(row);
}

double getLatitude (String row, int col) {
  return parseDouble(doubleAtColumn(row, col));
}

double getLongitude (String row, int col) {
  return parseDouble(doubleAtColumn(row, col));
}

String commaTest = commafy("test");
String commaTestEx = ",test,";

String header = readLine(path,0);
int numCols = numColumns(header);
int numColsEx = 5;

String row1 = readLine(path, 8);
String row1Data = dataAtColumn(row1, 3);
String row1DataEx = "37.707815";
String row1Int = parseInt(row1, 3);
String row1IntEx = "37.707815";
String row1Double = parseDouble(row1, 4);
String row1DoubleEx = "-122.466624";

String row2 = readLine(path, 5);
double lat = getLatitude(row2, latColIndex);
double long = getLongitude(row2, longColIndex);
