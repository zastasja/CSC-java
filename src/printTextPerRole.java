/**
 * Вам дан список ролей и сценарий пьесы в виде массива строчек.
 *
 * Каждая строчка сценария пьесы дана в следующем виде:
 * Роль: текст
 *
 * Текст может содержать любые символы.
 *
 * Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:
 *
 * Роль:
 * i) текст
 * j) текст2
 * ...
 * ==перевод строки==
 *
 * i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
 *
 * Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно, неправильная сборка результирующей строчки может выйти за ограничение по времени.
 *
 * Обратите внимание еще на несколько нюансов:
 *
 * имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
 * название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
 * роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
 * в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
 * будьте внимательны, не добавляйте лишних пробелов в конце строк.
 */
public class printTextPerRole {
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder a = new StringBuilder();
        for (String role : roles) {
            a.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    a.append((i+1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            a.append("\n");
        }
        return a.toString();
    }
}


