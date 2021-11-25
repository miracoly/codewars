module Codewars.Kyu6 where

spinWords :: String -> String
spinWords = unwords . map reverseOver4 . words
  where
    reverseOver4 :: String -> String
    reverseOver4 str
      | length str <= 4 = str
      | otherwise = reverse str

difference :: Eq a => [a] -> [a] -> [a]
difference a b = [x | x <- a, x `notElem` b]

findOutlier :: [Int] -> Int
findOutlier xs = head (if length evens == 1 then evens else odds)
  where
    evens = filter even xs
    odds = filter odd xs