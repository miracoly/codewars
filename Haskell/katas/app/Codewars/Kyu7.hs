module Codewars.Kyu7 where

import Data.Char
import Data.List.Split
import Data.List

getCount :: String -> Int
getCount = length . filter (`elem` "aeiou")

squareDigit :: Int -> Int
squareDigit num = read . concatMap show $ map (\c -> (^2) $ digitToInt c) $ show num

highAndLow :: String -> String
highAndLow str =  (show (maximum xs)) ++ " " ++ (show (minimum xs))
  where xs = map (read::String->Int) $ words str

xo :: String -> Bool
xo str = (length os) == (length xs)
  where
    os = [x | x <- str, x `elem` ['o', 'O']]
    xs = [x | x <- str, x `elem` ['x', 'X']]

toJadenCase :: String -> String
toJadenCase js = unwords up
  where up = [(toUpper x):xs | (x:xs) <- words js]