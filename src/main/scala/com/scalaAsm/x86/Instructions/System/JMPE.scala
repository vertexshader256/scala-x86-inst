package com.scalaAsm.x86
package Instructions
package System

// Description: Jump to IA-64 Instruction Set
// Category: general/branch

trait JMPE extends InstructionDefinition {
  val mnemonic = "JMPE"
}

object JMPE extends ZeroOperands[JMPE] with JMPEImpl

trait JMPEImpl extends JMPE {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x00) /+ 6
      }
}
