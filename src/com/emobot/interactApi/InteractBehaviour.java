package com.emobot.interactApi;

public class InteractBehaviour {

	public static EPANode getEPAValues(String behaviour){
		switch (behaviour) {
		case "abandon": return new EPANode(-1.94, -0.05, -0.14);
		case "abuse": return new EPANode(-2.97, 0.56, 0.01);
		case "acclaim": return new EPANode(1.36, 0.89, 0.65);
		case "accommodate": return new EPANode(0.95, 0.55, 0.35);
		case "accuse": return new EPANode(-1.44, 0.28, 0.44);
		case "address": return new EPANode(1, 0.46, 0.13);
		case "admire": return new EPANode(1.51, 0.86, 0.61);
		case "admonish": return new EPANode(-0.83, 0.37, 0.04);
		case "adopt": return new EPANode(1.92, 1.39, 0.6);
		case "adore": return new EPANode(2.14, 1.04, 1.5);
		case "advise": return new EPANode(1.42, 0.91, -0.24);
		case "affront": return new EPANode(0, 0.57, 0.03);
		case "aggravate": return new EPANode(-1.4, 0.23, 0.1);
		case "agitate": return new EPANode(-0.73, -0.07, 0.58);
		case "agree": return new EPANode(1.35, 0.58, 0.74);    // agree with
		case "aid": return new EPANode(1.66, 1.52, 0.65);
		case "alert": return new EPANode(1.37, 1.27, 0.8);
		case "alienate": return new EPANode(-1.75, 0.82, 0.09);
		case "amaze": return new EPANode(1.97, 1.44, 1.04);
		case "amuse": return new EPANode(1.69, 0.85, 1.2);
		case "analyze": return new EPANode(0.35, 0.42, 0.49);
		case "anger": return new EPANode(-1.12, 0.56, 0.56);
		case "annihilate": return new EPANode(-1.91, 1.57, 0.76);
		case "annoy": return new EPANode(-1.18, 0.34, 0.52);
		case "answer": return new EPANode(1.2, 0.56, 0.08);
		case "antagonize": return new EPANode(-0.89, 0.6, 0.48);
		case "ape": return new EPANode(-0.47, -0.38, 0.88);
		case "apologize": return new EPANode(1.86, 1.12, 0.08);  // apologize to
		case "appeal": return new EPANode(1.63, 0.28, 0.96);  // appeal to
		case "appease": return new EPANode(0.28, -0.21, 0.47);
		case "applaud": return new EPANode(1.74, 0.52, 0.52);
		case "appoint": return new EPANode(1.77, 1.58, 0.26);
		case "appreciate": return new EPANode(2.1, 1.06, 0.71);
		case "apprehend": return new EPANode(1.04, 1.22, 1.08);
		case "approach": return new EPANode(0.95, 1.1, 0.47);
		case "approve": return new EPANode(1.66, 0.9, -0.03);  // approve of
		case "argue with": return new EPANode(-0.78, 0.8, 0.67);
		case "arm": return new EPANode(-0.44, 0.73, 0.11);
		case "arouse": return new EPANode(1.54, 1.27, 1.37);
		case "arrest": return new EPANode(0.03, 1.25, 0.62);
		case "ask about": return new EPANode(1.28, 0.53, 0.39);
		case "ask": return new EPANode(1.28, 0.2, 0.89);
		case "assail": return new EPANode(0.08, 1.39, 0.17);
		case "assault": return new EPANode(-2.35, 1.28, 0.63);
		case "assist": return new EPANode(2.23, 1.27, 0.82);
		case "astonish": return new EPANode(1.49, 1, 0.84);
		case "astound": return new EPANode(1.64, 1.28, 1.08);
		case "attack": return new EPANode(-1.97, 1.34, 0.92);
		case "authorize": return new EPANode(1.05, 1.43, 0.11);
		case "avoid": return new EPANode(-0.61, -0.45, -0.12);
		case "awake": return new EPANode(0.08, 0.17, 0);
		case "awe": return new EPANode(0.86, 0.53, 0.95);
		case "baby": return new EPANode(-0.06, 0.61, -0.16);
		case "back": return new EPANode(1.42, 1.45, 0.12);
		case "badger": return new EPANode(-1.39, 0.21, 0.39);
		case "bait": return new EPANode(-0.5, 0.02, 0.03);
		case "bamboozle": return new EPANode(-1.08, 0.15, 0.25);
		case "baptize": return new EPANode(1.18, 0.58, -0.08);
		case "bawl out": return new EPANode(-0.8, 0.57, 0.29);
		case "beckon": return new EPANode(0.51, 0.7, 0.05);
		case "bed": return new EPANode(1.14, 0.78, 0.76);
		case "befriend": return new EPANode(0.95, 0.96, 0.72);
		case "befuddle": return new EPANode(-0.08, -0.09, 0.21);
		case "beg": return new EPANode(-1, -1.52, 0.71);
		case "believe": return new EPANode(1.55, 0.8, 0.44);
		case "belittle": return new EPANode(-1.74, 0.13, 0.13);
		case "berate": return new EPANode(-1.21, 0.47, -0.16);
		case "beseech": return new EPANode(0.4, 0.37, 0.32);
		case "betray": return new EPANode(-1.7, 0.7, 0.33);
		case "bewilder": return new EPANode(-0.11, 0.41, 0.76);
		case "bewitch": return new EPANode(-0.94, 0.35, -0.13);
		case "bias": return new EPANode(-1.87, -0.1, -0.56);
		case "bill": return new EPANode(-0.27, 0.48, 0.23);
		case "bind": return new EPANode(-0.32, 1.07, 0.15);
		case "blackmail": return new EPANode(-2.24, 1.34, -0.28);
		case "blame": return new EPANode(-1.41, -0.08, 0);
		case "bless": return new EPANode(1.66, 1.2, -0.54);
		case "bluff": return new EPANode(-0.79, 0.4, 0.55);
		case "boss": return new EPANode(-1.34, 1.25, 0);
		case "bother": return new EPANode(-1.42, -0.42, 0.69);
		case "bribe": return new EPANode(-0.94, 0.63, 0.06);
		case "brief": return new EPANode(1.36, 0.71, 0.05);
		case "browbeat": return new EPANode(-1.3, 0.78, -0.27);
		case "bug": return new EPANode(-1.05, 0.02, 0.59);
		case "bully": return new EPANode(-1.71, 1.05, 0.94);
		case "bury": return new EPANode(-1.52, 0.53, -0.51);
		case "butter up": return new EPANode(0.32, 0.77, 0.45);
		case "cajole": return new EPANode(0.12, 0.26, 0.41);
		case "call": return new EPANode(1.39, 0.59, 0.63);
		case "calm": return new EPANode(2.02, 0.97, 0.37);
		case "captivate": return new EPANode(1.22, 1.28, 0.32);
		case "capture": return new EPANode(-0.33, 1.45, 0.93);
		case "caress": return new EPANode(1.73, 0.62, 0.82);
		case "catch": return new EPANode(0.76, 1.33, 0.88);
		case "caution": return new EPANode(1.35, 0.92, -0.18);
		case "challenge": return new EPANode(1.19, 1.36, 0.86);
		case "charm": return new EPANode(1.38, 1.21, 1.03);
		case "chase": return new EPANode(-0.12, 0.72, 1.12);
		case "chatter": return new EPANode(0.8, -0.11, 0.59);  // chatter to
		case "cheat": return new EPANode(-1.72, 0.77, 0.66);
		case "cheer": return new EPANode(2.2, 1.24, 1.34);
		case "chide": return new EPANode(-0.28, 0, 0.28);
		case "classify": return new EPANode(-0.18, 0.52, 0.14);
		case "coach": return new EPANode(1.64, 1.51, 0.11);
		case "coax": return new EPANode(0.11, 0.88, 0.28);
		case "coddle": return new EPANode(0.25, 0.64, 0.04);
		case "coerce": return new EPANode(-0.84, 1.28, 0.71);
		case "combat": return new EPANode(-0.94, 1.2, 1.13);
		case "comfort": return new EPANode(2, 0.63, 0.04);
		case "command": return new EPANode(-0.46, 1.69, -0.11);
		case "commend": return new EPANode(1.47, 1.22, -0.05);
		case "compliment": return new EPANode(1.88, 1.01, 0.5);
		case "con": return new EPANode(-1.21, 0.74, 0.64);
		case "condemn": return new EPANode(-1.06, 0.83, -0.28);
		case "confide": return new EPANode(1.7, 0.57, -0.07);  // confide in
		case "confine": return new EPANode(-1.29, 0.89, -0.24);
		case "confound": return new EPANode(-0.52, 0.35, -0.23);
		case "confront": return new EPANode(0.61, 0.91, 0.83);
		case "confuse": return new EPANode(-1.18, 0.39, 0.03);
		case "congratulate": return new EPANode(1.98, 0.74, 0.32);
		case "consider": return new EPANode(0.45, 0.02, 0.22);
		case "console": return new EPANode(1.67, 1.14, 0.02);
		case "constrain": return new EPANode(-0.29, 1.3, -0.02);
		case "consult": return new EPANode(1.16, 0.61, -0.07);
		case "contemplate": return new EPANode(0.45, 0.56, -0.07);
		case "contradict": return new EPANode(-0.27, 0.11, 0.46);
		case "control": return new EPANode(-1.52, 1.18, -0.07);
		case "convert": return new EPANode(0.54, 0.67, 0.1);
		case "convict": return new EPANode(-0.49, 1.66, 0.02);
		case "convince": return new EPANode(1.12, 1.14, 0.56);
		case "corner": return new EPANode(-1.48, 0.88, 0.95);
		case "correct": return new EPANode(0.37, 0.21, 0.1);
		case "corrupt": return new EPANode(-1.85, 0.62, 0.27);
		case "counsel": return new EPANode(1.77, 0.9, 0.33);
		case "court": return new EPANode(0.99, 0.69, 1.17);
		case "criticize": return new EPANode(-0.95, -0.07, -0.49);
		case "cross-examine": return new EPANode(0.41, 1.19, 0.2);
		case "cuddle": return new EPANode(1.77, 0.81, 0.59);
		case "cue": return new EPANode(0.6, 0.66, 0.22);
		case "cure": return new EPANode(2.73, 1.72, 0.55);
		case "curse": return new EPANode(-1.02, 0.26, 0);
		case "cuss": return new EPANode(-0.83, 0.25, 0.05);
		case "damn": return new EPANode(-1.38, 0.74, -0.11);
		case "dance": return new EPANode(1.74, 0.87, 1.19);  // dance with
		case "dare": return new EPANode(0.22, 0.8, 0.74);
		case "dazzle": return new EPANode(1.5, 1.18, 1.22);
		case "debate": return new EPANode(0.88, 0.59, 0.5);  // debate with
		case "deceive": return new EPANode(-1.6, 1.05, 0.61);
		case "defend": return new EPANode(1.72, 1.54, 0.88);
		case "defile": return new EPANode(-1.12, 0.31, -0.18);
		case "deflate": return new EPANode(-0.81, 0.96, 0.76);
		case "defy": return new EPANode(-0.61, 0.58, 0.37);
		case "degrade": return new EPANode(-2.01, 0.44, 0.19);
		case "delay": return new EPANode(-1.42, 0.08, -0.23);
		case "delight": return new EPANode(1.52, 0.71, 0.07);
		case "delude": return new EPANode(-0.25, 0.92, 0.27);
		case "demean": return new EPANode(-2.21, 0.63, 0.17);
		case "demoralize": return new EPANode(-2.01, 0.49, 0.09);
		case "denounce": return new EPANode(-0.8, 0.63, -0.34);
		case "deprave": return new EPANode(-0.93, 0.32, -0.42);
		case "deprecate": return new EPANode(-1.68, -0.5, -0.13);
		case "deprive": return new EPANode(-1.73, 0.65, -0.3);
		case "deride": return new EPANode(0.28, 0.78, -0.41);
		case "desert": return new EPANode(-2.01, -0.7, 0.08);
		case "desire someone sexually": return new EPANode(2.03, 1.28, 1.48);
		case "desire": return new EPANode(1.5, 0.74, 1.03);
		case "despise": return new EPANode(-1.56, 0.2, -0.09);
		case "destroy": return new EPANode(-1.71, 1.36, 0.25);
		case "detain": return new EPANode(-0.76, 1.1, -0.28);
		case "deter": return new EPANode(-0.5, 0.84, -0.07);
		case "detest": return new EPANode(-0.97, 0.19, 0.06);
		case "direct": return new EPANode(1.37, 0.82, 0.2);
		case "disable": return new EPANode(-1.11, 1.03, 0.07);
		case "disagree": return new EPANode(0.02, 0.75, 0.5);  // disagree with
		case "disappoint": return new EPANode(-1.78, -0.37, -0.06);
		case "disbelieve": return new EPANode(-0.68, 0.17, -0.21);
		case "discipline": return new EPANode(0.24, 1.35, 0.19);
		case "disconcert": return new EPANode(-1.03, 0.18, -0.11);
		case "discourage": return new EPANode(-1.54, 0.25, -0.49);
		case "discredit": return new EPANode(-1.06, 0.76, 0.46);
		case "discriminate": return new EPANode(-2.14, 0.68, -0.91);  // discriminate against
		case "disenchant": return new EPANode(-0.93, -0.14, 0.05);
		case "disgrace": return new EPANode(-1.5, 0.1, -0.05);
		case "disillusion": return new EPANode(-1.57, 0.71, 0.03);
		case "dislike": return new EPANode(-1.08, 0.15, -0.09);
		case "disobey": return new EPANode(-1.12, 0.49, 0.62);
		case "displease": return new EPANode(-1.34, -0.48, -0.5);
		case "disregard": return new EPANode(-0.64, 0.26, 0);
		case "disrespect": return new EPANode(-1.78, -0.28, -0.14);
		case "dissuade": return new EPANode(-0.43, 0.65, -0.06);
		case "distress": return new EPANode(-1.27, 0.2, 0.26);
		case "distrust": return new EPANode(-1.47, -0.79, -0.23);
		case "disturb": return new EPANode(-0.75, 0.1, -0.15);
		case "divert": return new EPANode(0.01, 0.55, 0.48);
		case "divorce": return new EPANode(-1.44, 0.26, -0.19);
		case "dog": return new EPANode(-1.13, -0.28, 0.43);
		case "dominate": return new EPANode(-1, 1.65, 0.61);
		case "dope": return new EPANode(-1.76, 0.33, 0.33);
		case "double-cross": return new EPANode(-1.46, 0.64, 0.05);
		case "doubt": return new EPANode(-0.55, -0.08, -0.02);
		case "dress": return new EPANode(0.56, 0.12, -0.3);
		case "drug": return new EPANode(-1.95, 0.61, 0.35);
		case "dupe": return new EPANode(-0.76, 0.38, 0.16);
		case "educate": return new EPANode(2.03, 1.64, -0.06);
		case "elude": return new EPANode(-0.25, 0.56, 0.73);
		case "embarrass": return new EPANode(-1, 0.28, 0.48);
		case "embrace": return new EPANode(1.68, 1.05, 0.69);
		case "emulate": return new EPANode(0.39, -0.25, 0.36);
		case "encourage": return new EPANode(2.33, 1.46, 0.64);
		case "endanger": return new EPANode(-2.09, 0.42, 0.45);
		case "endure": return new EPANode(0.35, 0.52, 0.13);
		case "engage": return new EPANode(0.95, 0.79, 0.97);
		case "enjoy": return new EPANode(1.96, 0.65, 0.72);
		case "enrage": return new EPANode(-1.37, 1.06, 0.55);
		case "enrapture": return new EPANode(0.29, 0.58, 0.66);
		case "enslave": return new EPANode(-1.94, 1.12, -0.36);
		case "ensnare": return new EPANode(-1.07, 0.9, -0.03);
		case "entertain": return new EPANode(1.48, 1.09, 1.04);
		case "enthrall": return new EPANode(1.01, 0.93, 1.06);
		case "entice": return new EPANode(1.24, 1.01, 0.98);
		case "entrap": return new EPANode(-1.35, 1.16, 0.27);
		case "entreat": return new EPANode(0.71, 0.54, -0.12);
		case "envy": return new EPANode(0.28, -0.48, 0.44);
		case "escape": return new EPANode(0.65, 0.92, 1.1);
		case "esteem": return new EPANode(1.33, 0.69, 0.93);
		case "evade": return new EPANode(0.17, 0.44, 0.7);
		case "evaluate": return new EPANode(0.66, 1.04, 0.05);
		case "evict": return new EPANode(-1.44, 1.29, -0.41);
		case "exalt": return new EPANode(0.64, 0.21, 0.27);
		case "examine": return new EPANode(0.64, 0.94, 0.2);
		case "excite": return new EPANode(1.24, 0.8, 0.93);
		case "exclude": return new EPANode(-1.21, 0.26, 0.3);
		case "excuse": return new EPANode(1.22, 0.48, 0.26);
		case "execute": return new EPANode(-2.48, 2.04, 0.32);
		case "exhaust": return new EPANode(-0.15, 0.6, 0.95);
		case "exhibit": return new EPANode(-0.48, 0.57, 0.38);
		case "exonerate": return new EPANode(0.73, 1.27, -0.2);
		case "experience": return new EPANode(1.69, 1.09, 0.55);
		case "explain": return new EPANode(1.03, 0.21, 0.44);
		case "exploit": return new EPANode(-1.96, 0.82, -0.35);
		case "expose": return new EPANode(0.13, 0.78, 0.47);
		case "extol": return new EPANode(0.29, 0.98, 1.02);
		case "eye": return new EPANode(0.85, 0.04, 0.99);
		case "face": return new EPANode(0.58, 1.12, 0.47);
		case "favor": return new EPANode(0.74, 0.41, 0.2);
		case "fear": return new EPANode(-1.28, -0.49, 0.51);
		case "feed": return new EPANode(1.9, 0.97, 0.39);
		case "fight": return new EPANode(-1.3, 1.1, 1.2);
		case "fine": return new EPANode(-0.66, 0.67, -0.19);
		case "fix": return new EPANode(1.02, 1.31, 0.18);
		case "flail": return new EPANode(-1.01, 0.46, 0.33);
		case "flatter": return new EPANode(1.84, 0.83, 0.84);
		case "flee": return new EPANode(-0.25, -0.29, 0.89);
		case "flunk": return new EPANode(-1.47, 1.1, -0.17);
		case "fluster": return new EPANode(-0.75, -0.07, 0.25);
		case "foil": return new EPANode(-0.47, 0.55, 0.56);
		case "follow": return new EPANode(-0.36, -0.29, -0.35);
		case "fondle": return new EPANode(0.54, 0.38, 0.53);
		case "fool": return new EPANode(-0.34, 0.95, 0.53);
		case "force": return new EPANode(-1.66, 1.03, 0.45);
		case "forget": return new EPANode(-0.95, 0.11, 0.2);
		case "forgive": return new EPANode(1.87, 1.59, 0.36);
		case "forsake": return new EPANode(-1.23, 0.32, -0.13);
		case "fox": return new EPANode(0.34, 0.93, 0.58);
		case "frame": return new EPANode(-1.63, 0.56, -0.08);
		case "freak": return new EPANode(-0.88, 0.4, 0.36);  // freak out
		case "frighten": return new EPANode(-1.11, 0.38, 0.53);
		case "frisk": return new EPANode(-0.46, 1.02, 0.29);
		case "frustrate": return new EPANode(-1.08, 0.36, 0.26);
		case "glorify": return new EPANode(1.06, 1.09, 0.88);
		case "goad": return new EPANode(0.06, -0.06, 0.17);
		case "govern": return new EPANode(0.56, 1.72, 0.03);
		case "grab": return new EPANode(-0.86, 0.4, 0.44);
		case "gratify": return new EPANode(1.56, 1.23, 0.46);
		case "greet": return new EPANode(1.78, 0.71, 0.55);
		case "grieve": return new EPANode(-0.23, 0.39, -0.23);  // grieve for
		case "guard": return new EPANode(1.19, 1.26, 0.8);
		case "guide": return new EPANode(1.87, 1.26, 0.13);
		case "gyp": return new EPANode(-1.77, 0.63, 0.27);
		case "hail": return new EPANode(0.52, 0.63, -0.14);
		case "halt": return new EPANode(0.11, 1.31, 0.39);
		case "handcuff": return new EPANode(-0.56, 1.23, 0.53);
		case "harangue": return new EPANode(-0.35, 0.12, -0.4);
		case "harass": return new EPANode(-1.56, 0.66, 0.18);
		case "harm": return new EPANode(-2.24, 0.34, 0.02);
		case "hassle": return new EPANode(-1.41, 0.5, 0.53);
		case "hate": return new EPANode(-1.8, 0.48, -0.02);
		case "haunt": return new EPANode(-1.37, 0.75, -0.21);
		case "haze": return new EPANode(-1.1, 0.5, 0.75);
		case "heal": return new EPANode(2.05, 1.75, 0.17);
		case "heckle": return new EPANode(-1.37, -0.05, 0.41);
		case "help": return new EPANode(2.69, 1.87, 1.21);
		case "hide from": return new EPANode(-1.23, -1.19, -0.11);
		case "hide": return new EPANode(0.58, 0.01, 0.4);
		case "hinder": return new EPANode(-1.42, 0.76, -0.19);
		case "hire": return new EPANode(1.5, 1.27, -0.07);
		case "hit": return new EPANode(-2.03, 0.65, 0.59);
		case "honor": return new EPANode(2.24, 1.6, 0.08);
		case "hoodwink": return new EPANode(-0.57, 0.75, 0.65);
		case "horrify": return new EPANode(-1.64, 0.5, 0.38);
		case "hound": return new EPANode(-1.19, 0.6, 0.44);
		case "hug": return new EPANode(2.33, 0.88, 0.37);
		case "humble": return new EPANode(0.37, 1.37, -0.13);
		case "humiliate": return new EPANode(-1.84, 0.36, 0.21);
		case "humor": return new EPANode(1.47, 0.75, 0.82);
		case "hurry": return new EPANode(-0.39, 0.39, 0.63);
		case "hurt": return new EPANode(-2.33, 0.31, 0.67);
		case "hush": return new EPANode(-1.06, -0.08, -0.18);
		case "hustle": return new EPANode(-1.23, 0.92, 0.9);
		case "hypnotize": return new EPANode(-0.04, 1.04, -0.01);
		case "idealize": return new EPANode(0.29, 0.04, 0.1);
		case "idolize": return new EPANode(0.61, 0, 0.92);
		case "ignore": return new EPANode(-0.79, 0.4, -0.17);
		case "imitate": return new EPANode(-0.51, -0.52, 0.47);
		case "impede": return new EPANode(-1.49, 0.84, 0.26);
		case "implore": return new EPANode(0.78, -0.11, 0.07);
		case "imprison": return new EPANode(-0.59, 1.23, -0.04);
		case "incite": return new EPANode(0.45, 0.94, 0.12);
		case "incriminate": return new EPANode(-0.75, 0.94, 0.04);
		case "indoctrinate": return new EPANode(0.32, 1.19, -0.48);
		case "indulge": return new EPANode(1.02, 0.68, -0.15);
		case "influence": return new EPANode(1.11, 0.68, 0.12);
		case "inform": return new EPANode(1.62, 1.25, 0.79);
		case "infuriate": return new EPANode(-1.02, 0.28, 0.42);
		case "initiate": return new EPANode(0.49, 0.7, 0.75);
		case "injure": return new EPANode(-1.8, 1.11, 0.67);
		case "inspect": return new EPANode(-0.15, 0.45, -0.04);
		case "inspire": return new EPANode(2.07, 1.62, 0.08);
		case "instruct": return new EPANode(1.08, 1.21, -0.19);
		case "insult": return new EPANode(-1.93, -0.49, 0.53);
		case "interest": return new EPANode(1.46, 0.98, 0.88);
		case "interrogate": return new EPANode(-0.48, 1.47, 0.42);
		case "interrupt": return new EPANode(-0.79, 0.14, 0.55);
		case "interview": return new EPANode(1.24, 0.77, 0.44);
		case "intimidate": return new EPANode(-0.86, 1.62, 0.84);
		case "invite": return new EPANode(1.58, 0.93, -0.05);
		case "irritate": return new EPANode(-1.34, 0.01, 0.54);
		case "jeer": return new EPANode(-0.76, 0.33, 0.75);
		case "jest": return new EPANode(0.44, 0.82, 0.52);
		case "joggle": return new EPANode(-0.54, 0.31, -0.14);
		case "join": return new EPANode(0.88, 0.22, 0.45);
		case "jolt": return new EPANode(-0.89, 0.66, 0.35);
		case "josh": return new EPANode(0.28, -0.09, 0.42);
		case "jostle": return new EPANode(-0.3, 0.41, 0.44);
		case "judge": return new EPANode(-0.82, 0.42, -0.49);
		case "kick": return new EPANode(-1.4, 0.55, 0.84);
		case "kid": return new EPANode(0.38, -0.04, 0.84);
		case "kill": return new EPANode(-3.33, 1.32, 0.65);
		case "kiss": return new EPANode(2.29, 1.04, 1.5);
		case "laud": return new EPANode(-0.31, 0.69, 0.36);
		case "laugh at": return new EPANode(-0.4, 0.26, 0.63);
		case "laugh": return new EPANode(2.02, 0.99, 0.43);
		case "lead": return new EPANode(1.3, 1.35, 0.68);
		case "leave": return new EPANode(-0.69, 0.67, 0.02);
		case "lie to": return new EPANode(-2.17, -0.54, 0.11);
		case "like": return new EPANode(2.09, 1.14, 0.67);
		case "listen": return new EPANode(2.11, 0.88, -0.15);
		case "loathe": return new EPANode(-1.49, 0.25, 0.25);
		case "look": return new EPANode(1.18, 0.52, 0.22);
		case "love": return new EPANode(2.76, 2.29, 1.32);
		case "lull": return new EPANode(0.27, 0.38, 0.11);
		case "lure": return new EPANode(-0.1, 0.94, 0.04);
		case "mace": return new EPANode(-0.77, 0.58, 0.09);
		case "make love to": return new EPANode(3.03, 2.09, 1.64);
		case "malign": return new EPANode(-0.82, -0.29, 0.12);
		case "manipulate": return new EPANode(-1.14, 0.97, 0.24);
		case "marry": return new EPANode(1.8, 1.28, 0.17);
		case "massage": return new EPANode(2.1, 0.9, 0.52);
		case "master": return new EPANode(0.06, 1.94, 0.22);
		case "medicate": return new EPANode(0.92, 1.31, 0.09);
		case "menace": return new EPANode(-1.49, 0.15, 0.32);
		case "mimic": return new EPANode(-0.83, -0.52, 0.53);
		case "misinform": return new EPANode(-1.51, 0.08, -0.13);
		case "misjudge": return new EPANode(-1.36, -0.12, -0.28);
		case "mislead": return new EPANode(-1.69, 0.44, 0.33);
		case "miss": return new EPANode(0.73, -0.1, -0.24);
		case "misunderstand": return new EPANode(-0.86, -0.85, -0.39);
		case "mock": return new EPANode(-1.62, -0.17, 0.48);
		case "molest": return new EPANode(-2.77, 0.56, -0.07);
		case "monitor": return new EPANode(0.14, 0.73, 0.32);
		case "monopolize": return new EPANode(-0.74, 1.5, 0.03);
		case "mortify": return new EPANode(-1.7, 0.41, -0.26);
		case "mother": return new EPANode(1.93, 1.5, 0.29);
		case "mug": return new EPANode(-2.23, 0.66, 0.69);
		case "murder": return new EPANode(-3.17, 1.01, 0.73);
		case "nab": return new EPANode(0.13, 0.71, 0.28);
		case "nag": return new EPANode(-1.53, 0.04, -0.03);
		case "nail": return new EPANode(-0.83, 1.13, 0.8);
		case "need": return new EPANode(0.58, -0.3, 0.49);
		case "needle": return new EPANode(-0.64, 0.1, -0.07);
		case "neglect": return new EPANode(-1.66, 0.54, 0.1);
		case "negotiate": return new EPANode(1.48, 1.36, 0.27);
		case "nestle": return new EPANode(1.09, 0.11, 0.3);
		case "notice": return new EPANode(1.27, 0.36, 0.59);
		case "nudge": return new EPANode(0.33, 0.26, 0.31);
		case "nuzzle": return new EPANode(0.87, 0.26, 0.8);
		case "obey": return new EPANode(0.4, -0.64, 0.38);
		case "oblige": return new EPANode(1.16, 0.52, 0.37);
		case "observe": return new EPANode(0.92, -0.16, -0.32);
		case "obstruct": return new EPANode(-0.68, 0.67, 0.36);
		case "offend": return new EPANode(-1.77, 0.58, 0.02);
		case "ogle": return new EPANode(-0.23, -0.33, -0.07);
		case "oppose": return new EPANode(0.38, 0.82, 0.64);
		case "oppress": return new EPANode(-2.24, 1.12, -0.07);
		case "order": return new EPANode(-0.37, 1.59, 0.22);
		case "ostracize": return new EPANode(-1.65, 0.54, 0.15);
		case "outdo": return new EPANode(1.04, 1.12, 1.16);
		case "outrage": return new EPANode(-1, 0.8, 0.72);
		case "outwit": return new EPANode(1.44, 1.6, 1.04);
		case "overhear": return new EPANode(-0.39, 0.16, 0.02);
		case "overlook": return new EPANode(-0.73, -0.05, -0.38);
		case "overrate": return new EPANode(-0.52, -0.2, 0.35);
		case "overwhelm": return new EPANode(0.67, 1.3, 0.47);
		case "overwork": return new EPANode(-1.6, 0.34, 0.35);
		case "pacify": return new EPANode(0.54, 0.63, 0.12);
		case "pamper": return new EPANode(1.21, 0.17, 0.41);
		case "parody": return new EPANode(0.04, 0.03, 0.46);
		case "pass": return new EPANode(0.27, 0.73, 0.01);
		case "patronize": return new EPANode(-1.2, 0.41, 0.1);
		case "pay for": return new EPANode(1.03, 0.74, 0.27);
		case "pay": return new EPANode(1.44, 0.6, 0.51);
		case "peek at": return new EPANode(-0.25, -0.26, 0.16);
		case "penalize": return new EPANode(-0.97, 1.16, 0.36);
		case "persecute": return new EPANode(-1.31, 0.8, -0.16);
		case "persuade": return new EPANode(0.42, 1.15, 0.45);
		case "pervert": return new EPANode(-1.37, -0.32, -0.42);
		case "pester": return new EPANode(-1.07, 0.18, 0.46);
		case "pet": return new EPANode(1.07, 0.45, 0.74);
		case "placate": return new EPANode(0.86, 0.58, 0.49);
		case "play": return new EPANode(1.41, 0.47, 1.29);
		case "please": return new EPANode(2.01, 1.21, 0.45);
		case "plot": return new EPANode(-1.38, 0.84, -0.18);
		case "poison": return new EPANode(-2.87, 0.9, -0.1);
		case "pooh-pooh": return new EPANode(-1.55, -0.5, -0.7);
		case "praise": return new EPANode(1.73, 0.69, 0.44);
		case "pray": return new EPANode(1.53, 0.63, -0.62);
		case "prod": return new EPANode(-0.73, 0.18, 0.33);
		case "prompt": return new EPANode(1.09, 0.45, 0.62);
		case "prosecute": return new EPANode(-0.12, 1.36, 0.12);
		case "protect": return new EPANode(1.88, 1.69, 0.91);
		case "provoke": return new EPANode(-1.08, 0.8, 0.83);
		case "psychoanalyze": return new EPANode(0.42, 1.04, -0.61);
		case "punch": return new EPANode(-2, 0.95, 0.99);
		case "punish": return new EPANode(-1.03, 1.15, -0.15);
		case "pursue": return new EPANode(0.77, 0.54, 0.75);
		case "push": return new EPANode(-1.34, 1.06, 0.38);
		case "putdown": return new EPANode(-2, -0.04, 0.27);
		case "quarrel": return new EPANode(-1.02, 0.4, 0.41);
		case "query": return new EPANode(0.83, 0.77, 0.02);
		case "question": return new EPANode(0.48, 0.32, -0.2);
		case "quiet": return new EPANode(-0.25, 1.11, 0.02);
		case "quiz": return new EPANode(0.49, 0.86, 0.26);
		case "radicalize": return new EPANode(0.14, 0.32, 0.45);
		case "rally": return new EPANode(1.37, 1.13, 0.55);
		case "rankle": return new EPANode(0.3, 0.06, 0.14);
		case "rape": return new EPANode(-3.34, 0.92, 0.06);
		case "rattle": return new EPANode(-0.53, 0.29, 0.49);
		case "ravish": return new EPANode(0.41, 0.25, 0.15);
		case "reassure": return new EPANode(1.81, 0.84, 0.92);
		case "rebel": return new EPANode(0.52, 1.27, 1.13);
		case "rebuff": return new EPANode(0.19, 0.09, 0.09);
		case "rebuke": return new EPANode(-0.2, 0.57, 0.2);
		case "reform": return new EPANode(0.7, 1, 0.38);
		case "refuse": return new EPANode(-0.84, 0.35, 0.36);
		case "regard": return new EPANode(1.06, 0.66, 0.25);
		case "rehabilitate": return new EPANode(2.03, 1.21, 0.21);
		case "reject": return new EPANode(-1.48, 0.94, 0.01);
		case "release": return new EPANode(1.02, 1.08, 0.29);
		case "relieve": return new EPANode(1.02, 0.51, 0.12);
		case "relish": return new EPANode(1.05, 0.48, 0.88);
		case "remember": return new EPANode(2.07, 0.3, 0.03);
		case "remind": return new EPANode(1.25, 0.86, 0.07);
		case "renounce": return new EPANode(-0.22, 0.37, 0.04);
		case "repel": return new EPANode(-0.48, 0.53, 0.04);
		case "reprimand": return new EPANode(0.18, 1.25, 0.17);
		case "reproach": return new EPANode(0.19, 0.95, 0.01);
		case "repulse": return new EPANode(-0.85, -0.09, 0.08);
		case "rescue": return new EPANode(2.25, 1.96, 1.22);
		case "respect": return new EPANode(2.39, 0.97, 0.18);
		case "restrain": return new EPANode(-0.17, 1.44, 0.62);
		case "revere": return new EPANode(1, 0.72, 0.07);
		case "rib": return new EPANode(0.16, -0.04, 0.24);
		case "ride": return new EPANode(0.3, 0.99, 0.64);
		case "ridicule": return new EPANode(-1.69, 0.24, 0.68);
		case "rile": return new EPANode(-0.48, 0.42, 0.54);
		case "rip-off": return new EPANode(-2, 0.84, 0.34);
		case "rob": return new EPANode(-2.24, 0.58, 0.91);
		case "rook": return new EPANode(-0.32, 0.1, 0.51);
		case "rouse": return new EPANode(0.54, 0.36, 0.83);
		case "rush": return new EPANode(-0.36, 0.54, 0.69);
		case "satisfy": return new EPANode(1.77, 1.43, 0.76);
		case "save": return new EPANode(2.03, 2.13, 1.15);
		case "scam": return new EPANode(-1.72, 0.57, 0.59);
		case "scare": return new EPANode(-1.19, 0.59, 0.96);
		case "scold": return new EPANode(-1.11, 0.71, -0.64);
		case "scorn": return new EPANode(-1.33, 0.36, -0.5);
		case "scrutinize": return new EPANode(-1.43, 0.23, 0.12);
		case "search": return new EPANode(0.18, 0.53, 0.26);
		case "seduce": return new EPANode(1.2, 1.58, 1.51);
		case "seize": return new EPANode(-0.83, 1.6, 0.7);
		case "sentence": return new EPANode(-0.29, 1.75, 0.21);
		case "serenade": return new EPANode(1.45, 0.84, 0.64);
		case "serve": return new EPANode(0.34, -0.32, -0.04);
		case "shackle": return new EPANode(-0.86, 1.13, 0.29);
		case "shaft": return new EPANode(-1.42, 0.54, 0.82);
		case "shame": return new EPANode(-1.38, 0.47, 0.47);
		case "shield": return new EPANode(1.53, 1.48, 0.17);
		case "shock": return new EPANode(-0.28, 0.79, 1.05);
		case "shoot": return new EPANode(-2.81, 1.15, 0.46);
		case "shun": return new EPANode(-1.43, 0.67, 0.03);
		case "shush": return new EPANode(-0.3, 0.28, -0.15);
		case "signal": return new EPANode(1.07, 0.26, 0.48);
		case "silence": return new EPANode(-0.75, 0.76, -0.33);
		case "sing": return new EPANode(1.72, 0.79, 0.63);
		case "sit next to": return new EPANode(0.98, -0.13, 0.13);
		case "slay": return new EPANode(-2.23, 1.23, 0.69);
		case "sleep": return new EPANode(1.98, 1.07, 1.09);
		case "slight": return new EPANode(-0.4, 0.05, 0.49);
		case "smile": return new EPANode(2.08, 0.88, 0.77);
		case "smother": return new EPANode(-1.15, 0.7, -0.12);
		case "snub": return new EPANode(-1.45, -0.09, 0.31);
		case "snuggle": return new EPANode(1.08, 0.36, 0.83);
		case "sock": return new EPANode(-0.81, 0.34, 0.73);
		case "soft soap": return new EPANode(1.83, 0.39, -0.31);
		case "soothe": return new EPANode(1.57, 1.01, 0.02);
		case "spam": return new EPANode(0.06, 0.63, 0.02);
		case "speak": return new EPANode(1.83, 0.67, 0.57);
		case "spoil": return new EPANode(0.13, 0.57, 0.38);
		case "spoof": return new EPANode(-0.04, 0.2, 0.18);
		case "spook": return new EPANode(-0.77, -0.12, 0);
		case "spurn": return new EPANode(-0.58, 0.67, -0.17);
		case "stall": return new EPANode(-0.51, 0.25, 0.08);
		case "startle": return new EPANode(-0.71, 0.24, 0.23);
		case "steal": return new EPANode(-2.08, 0.4, 0.24);
		case "stop": return new EPANode(0.25, 1.4, 0.26);
		case "strangle": return new EPANode(-2.51, 1.01, -0.38);
		case "strip": return new EPANode(0.1, 0.87, 1.55);
		case "stroke": return new EPANode(1.41, 0.86, 0.59);
		case "study": return new EPANode(0.64, 0.8, 0.1);
		case "stun": return new EPANode(-0.61, 0.49, 0.57);
		case "stymie": return new EPANode(-0.7, -0.32, 0.06);
		case "subdue": return new EPANode(-0.44, 0.52, 0.56);
		case "subjugate": return new EPANode(-0.57, 0.61, 0.28);
		case "submit": return new EPANode(-0.72, -0.69, -0.52);
		case "sue": return new EPANode(-1.13, 1.13, -0.24);
		case "summon": return new EPANode(0.21, 0.62, -0.16);
		case "supervise": return new EPANode(0.43, 1.31, 0.03);
		case "support": return new EPANode(1.59, 1.28, 0.42);
		case "surprise": return new EPANode(1.3, 0.59, 0.99);
		case "suspect": return new EPANode(-0.88, 0.14, -0.28);
		case "sweet talk": return new EPANode(0.96, 0.37, 0.57);
		case "swindle": return new EPANode(-1.29, 0.44, 0.66);
		case "tackle": return new EPANode(-0.2, 1.23, 1.41);
		case "talk": return new EPANode(1.46, 0.31, 0.01);
		case "tantalize": return new EPANode(0.26, 0.63, 0.86);
		case "tap": return new EPANode(0.1, -0.07, 0.07);
		case "taunt": return new EPANode(-0.34, 0.46, 0.5);
		case "teach": return new EPANode(1.6, 1.56, -0.12);
		case "tease": return new EPANode(-1.22, 0.37, 0.85);
		case "tempt": return new EPANode(0.41, 0.99, 0.81);
		case "terrorize": return new EPANode(-2.51, 1.18, 0.48);
		case "test": return new EPANode(0.36, 0.97, -0.08);
		case "thank": return new EPANode(2.14, 0.92, 0.62);
		case "threaten": return new EPANode(-2, 0.82, 0.58);
		case "thrill": return new EPANode(1.56, 0.99, 0.94);
		case "tickle": return new EPANode(1.1, 0.71, 1.16);
		case "tip": return new EPANode(1.11, 0.47, 0.43);
		case "titillate": return new EPANode(0.84, 0.84, 1.01);
		case "toast": return new EPANode(0.76, 0.52, 0.48);
		case "torment": return new EPANode(-1.83, 0.32, 0.36);
		case "torture": return new EPANode(-2.4, 0.77, 0.36);
		case "train": return new EPANode(1.77, 1.25, 0.59);
		case "trap": return new EPANode(-1.18, 0.97, 0.48);
		case "treat": return new EPANode(1.76, 0.74, 0.51);
		case "trick": return new EPANode(-1.04, 0.48, 0.32);
		case "trust": return new EPANode(2.04, 1.01, -0.02);
		case "underestimate": return new EPANode(-1.28, -0.48, 0.02);
		case "undermine": return new EPANode(-1.25, 0.56, 0.3);
		case "understand": return new EPANode(2.35, 1.13, 0.61);
		case "undress": return new EPANode(1.54, 0.84, 0.96);
		case "unnerve": return new EPANode(-0.94, 0.27, 0.56);
		case "uplift": return new EPANode(1.16, 0.87, 1.02);
		case "upset": return new EPANode(-1.89, 0.04, -0.04);
		case "upstage": return new EPANode(-0.06, 0.87, 0.6);
		case "urge": return new EPANode(0.72, 0.77, -0.13);
		case "use": return new EPANode(-1.97, 0.43, 0.58);
		case "value": return new EPANode(1.7, 0.84, 0.44);
		case "vanquish": return new EPANode(0.13, 0.84, 0.37);
		case "vex": return new EPANode(-1.46, 0.36, 0.61);
		case "victimize": return new EPANode(-2.01, 1.09, 0.64);
		case "visit": return new EPANode(1.65, 0.81, 0.42);
		case "waken": return new EPANode(0.51, 0.37, -0.12);
		case "warn": return new EPANode(1.32, 0.95, 0.6);
		case "watch": return new EPANode(0.36, 0.34, 0.37);
		case "welcome": return new EPANode(2.13, 0.96, 0.52);
		case "wheedle": return new EPANode(0.52, -0.37, 0.25);
		case "whip": return new EPANode(-1.74, 1.16, 0.66);
		case "work": return new EPANode(0.03, 0.83, 0.25);
		case "worship": return new EPANode(0.51, -0.31, 0.03);
		case "wrong": return new EPANode(-2.02, -0.23, 0.18);
		case "zap": return new EPANode(-0.9, 0.78, 0.95);
		default:      return null;
		}
	}
}
