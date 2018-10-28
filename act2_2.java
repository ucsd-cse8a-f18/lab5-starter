// Activity 2
// Question 2: find the maximum sugarpercent of fruity candies

String path = "/candy-data.csv";

int fruityColIndex = 2;
int sugarPercentColIndex = 10;

boolean isFruity(String rowData) {
  return true;
}

String allCandyData = readFile(path);
String fruityRows = filter(allCandyData, r->isFruity(allCandyData));
int maxFruitySugarPercent = maxInt(fruityRows, sugarPercentColIndex);
