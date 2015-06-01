package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Undefined Instruction
// Category: general/control

trait UD2 extends InstructionDefinition {
  val mnemonic = "UD2"
}

object UD2 extends ZeroOperands[UD2] with UD2Impl

trait UD2Impl extends UD2 {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x0B)
      }
}
